package com.service.sdzess.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSdzess {

        SdzessDelegate sdzessDelegate = new SdzessDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = sdzessDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}