package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject88fu {

        Project88fuDelegate project88fuDelegate = new Project88fuDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project88fuDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}