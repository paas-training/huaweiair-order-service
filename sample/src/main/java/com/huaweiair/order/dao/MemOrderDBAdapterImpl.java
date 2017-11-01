package com.huaweiair.order.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.huaweiair.order.model.FlightOrder;

public class MemOrderDBAdapterImpl implements OrderDbAdapter{
	
	private Map<String, FlightOrder> orderStore;
	
	public MemOrderDBAdapterImpl() {
		orderStore = new HashMap<String, FlightOrder>();
	}
	@Override
	public boolean insertOrder(FlightOrder order) {
		if(! orderStore.containsKey(order.getOrderId()) ){
			orderStore.put(order.getOrderId(), order);
		}
		return true;
	}

	@Override
	public FlightOrder[] queryOrders(String userId) {
		List<FlightOrder> orders = new ArrayList<FlightOrder>();
		orderStore.forEach((k, v) -> {
			if (v.getUserId().equals(userId)) {
				orders.add(v);
			}
		});
		return orders.toArray(new FlightOrder[]{});
	}

	@Override
	public boolean updateOrder(String orderId, int action) {
		FlightOrder order = orderStore.get(orderId);
		if (null == order) {
			return false;
		}
		order.setOrderStatus(action);
		return true;
	}

	@Override
	public boolean deleteOrder(String orderId) {
		orderStore.remove(orderId);
		return true;
	}

}
