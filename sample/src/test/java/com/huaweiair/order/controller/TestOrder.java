package com.huaweiair.order.controller;

import com.huaweiair.order.model.FlightOrder;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestOrder {

    OrderImpl orderImpl;

    @Before
    public void setup() throws Exception{
    	System.setProperty("spring.profiles.active", "jpa");
        Log4jUtils.init();
        BeanUtils.init();
        orderImpl = BeanUtils.getBean("orderImpl");
    }



    @Test
    public void testcreateOrders(){

        Boolean expactReturnValue = false; // You should put the expect Boolean type value here.

        // You should put the parameter here, in such footprint: orderImpl.createOrders(FlightFlag order)
        Boolean returnValue = orderImpl.createOrders(null);

        assertEquals(expactReturnValue, returnValue);
    }
    

    @Test
    public void testdeleteOrder(){

        Boolean expactReturnValue = false; // You should put the expect Boolean type value here.

        // You should put the parameter here, in such footprint: orderImpl.deleteOrder(String orderId)
        Boolean returnValue = orderImpl.deleteOrder(null);

        assertEquals(expactReturnValue, returnValue);
    }
    

    @Test
    public void testgetAllOrders(){

        // You should put the parameter here, in such footprint: orderImpl.getAllOrders(String userId)
        List<FlightOrder> returnValue = orderImpl.getAllOrders(null);

        assertTrue(returnValue.isEmpty());
    }
    

    @Test
    public void testmodifyOrder(){

        Boolean expactReturnValue = false; // You should put the expect Boolean type value here.

        // You should put the parameter here, in such footprint: orderImpl.modifyOrder(String orderId, Integer action)
        Boolean returnValue = orderImpl.modifyOrder(null, null);

        assertEquals(expactReturnValue, returnValue);
    }
    
}




