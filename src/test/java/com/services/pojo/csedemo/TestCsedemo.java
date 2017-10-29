package com.services.pojo.csedemo;

import com.services.pojo.csedemo.model.Person;


import static org.junit.Assert.*;  
  
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Ignore;  
import org.junit.Test;  

public class TestCsedemo {

    CsedemoImpl csedemoImpl = new CsedemoImpl();


    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: csedemoImpl.add(Integer a, Integer b)
        Integer returnValue = csedemoImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }
    

    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: csedemoImpl.sayHei(String name)
        String returnValue = csedemoImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }
    

    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: csedemoImpl.sayHello(String name)
        String returnValue = csedemoImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }
    

    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: csedemoImpl.sayHi(String name)
        String returnValue = csedemoImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }
    

    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: csedemoImpl.saySomething(String prefix, Person user)
        String returnValue = csedemoImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }
    
}




