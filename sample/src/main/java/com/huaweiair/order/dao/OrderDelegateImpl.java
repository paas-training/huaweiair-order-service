package com.huaweiair.order.dao;

import com.huaweiair.order.model.FlightFlag;
import com.huaweiair.order.model.FlightOrder;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OrderDelegateImpl{

	private OrderDbAdapter dbAdapter;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderDelegateImpl.class);
	
	public OrderDelegateImpl() {
		String memoryDB = System.getenv("db");

		if ("memory".equalsIgnoreCase(memoryDB)) {
			dbAdapter = new MemOrderDBAdapterImpl();
		} else {
		    String ip = System.getenv("MYSQL_DB_IP");
		    String port = System.getenv("MYSQL_DB_PORT");
			LOGGER.info("mysql ip: {} port: {}",ip,port);
		    dbAdapter =
		    		new MysqlOrderDbAdapterImpl(null != ip ? ip : "mysql", null != port ? Integer.parseInt(port) : 30006);		
		}
	}
	
    public Boolean createOrders(FlightFlag order){
    	if (order == null) {
    		return false;
    	}
        boolean flagOne = false;
        boolean flagTwo = false;
        Date date = new Date();  
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String dateNowStr = simpleDateFormat.format(date);  
        if (null != order.getToFlightId() && !order.getToFlightId().isEmpty()) {
          FlightOrder toFlightOrder = new FlightOrder();
          toFlightOrder.setUserId(order.getUserId());
          toFlightOrder.setOrderId(UUID.randomUUID().toString());
          toFlightOrder.setFlightId(order.getToFlightId());
          toFlightOrder.setName(order.getFromAirPortName() + "-" + order.getToAirPortName());
          toFlightOrder.setScheduledDepartureTime(order.getToScheduledDepartureTime());
          toFlightOrder.setScheduledArrivalTime(order.getToScheduledArrivalTime());
          toFlightOrder.setFlightClass(order.getToFlightClass());
          toFlightOrder.setFlightPrice(order.getToFlightPrice());
          toFlightOrder.setOrderTime(dateNowStr);
          toFlightOrder.setOrderStatus(0);
          flagOne = dbAdapter.insertOrder(toFlightOrder);
        }
        if (null != order.getRetFlightId() && !order.getRetFlightId().isEmpty()) {
          FlightOrder returnFlightOrder = new FlightOrder();
          returnFlightOrder.setUserId(order.getUserId());
          returnFlightOrder.setOrderId(UUID.randomUUID().toString());
          returnFlightOrder.setFlightId(order.getRetFlightId());
          returnFlightOrder.setName(order.getToAirPortName() + "-" + order.getFromAirPortName());
          returnFlightOrder.setScheduledDepartureTime(order.getRetScheduledDepartureTime());
          returnFlightOrder.setScheduledArrivalTime(order.getRetScheduledArrivalTime());
          returnFlightOrder.setFlightClass(order.getRetFlightClass());
          returnFlightOrder.setFlightPrice(order.getRetFlightPrice());
          returnFlightOrder.setOrderTime(dateNowStr);
          returnFlightOrder.setOrderStatus(0);

          flagTwo = dbAdapter.insertOrder(returnFlightOrder);
        }
        return flagOne && flagTwo;
    };


    public Boolean deleteOrder(String orderId){
    	if (orderId == null) {
    		return false;
    	}
        return dbAdapter.deleteOrder(orderId);
    };


    public List<FlightOrder> getAllOrders(String userId){
        return Arrays.asList(dbAdapter.queryOrders(userId));
    };


    public Boolean modifyOrder(String orderId, Integer action){
    	if (orderId == null || action == null) {
    		return false;
    	}
        return dbAdapter.updateOrder(orderId, action);
    };

}