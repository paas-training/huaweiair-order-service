package com.huaweiair.order.controller;

import java.util.List;

import com.huaweiair.order.model.FlightFlag;
import com.huaweiair.order.model.FlightOrder;


public interface Order {

    Boolean createOrders(FlightFlag order);


    Boolean deleteOrder(String orderId);


    List<FlightOrder> getAllOrders(String userId);


    Boolean modifyOrder(String orderId, Integer action);

}