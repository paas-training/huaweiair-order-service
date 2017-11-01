package com.huaweiair.order.controller;

import com.huaweiair.order.model.FlightFlag;
import com.huaweiair.order.model.FlightOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoCodegen", date = "2017-10-31T21:11:32.501+08:00")

@RpcSchema(schemaId = "order")
public class OrderImpl implements Order{

    @Autowired
    private OrderDelegate orderDelegate;


    public Boolean createOrders(FlightFlag order) {

        return orderDelegate.createOrders(order);
    }


    public Boolean deleteOrder(String orderId) {

        return orderDelegate.deleteOrder(orderId);
    }


    public List<FlightOrder> getAllOrders(String userId) {

        return orderDelegate.getAllOrders(userId);
    }


    public Boolean modifyOrder(String orderId, Integer action) {

        return orderDelegate.modifyOrder(orderId, action);
    }

}
