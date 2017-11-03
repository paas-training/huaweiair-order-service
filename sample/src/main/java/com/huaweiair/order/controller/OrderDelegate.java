package com.huaweiair.order.controller;

import com.huaweiair.order.dao.OrderDelegateImpl;
import com.huaweiair.order.model.FlightFlag;
import com.huaweiair.order.model.FlightOrder;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OrderDelegate{
	
	private OrderDelegateImpl delegateImpl;
	
	public OrderDelegate() {
		delegateImpl = new OrderDelegateImpl();
	}

    public Boolean createOrders(FlightFlag order){

        // Do Some Magic Here!
        return delegateImpl.createOrders(order);
    };


    public Boolean deleteOrder(String orderId){

        // Do Some Magic Here!
        return delegateImpl.deleteOrder(orderId);
    };


    public List<FlightOrder> getAllOrders(String userId){

        // Do Some Magic Here!
        return delegateImpl.getAllOrders(userId);
    };


    public Boolean modifyOrder(String orderId, Integer action){

        // Do Some Magic Here!
        return delegateImpl.modifyOrder(orderId, action);
    };

}