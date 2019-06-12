package com.kishorpan24010512.myFirstProject;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {
    @Test
    public void testGetHelloWorld() {
        HelloWorldController test = new HelloWorldController();

        assertEquals("Should display Hello World",
                "Hello World",
                test.getHelloWorld());

    }

    @Test
    public void testGetHelloToMe() {
        HelloWorldController test = new HelloWorldController();

        assertEquals("This should return hello, ", "Hello, Kush", test.getHelloToMe("Kush"));
    }

    @Test
    public void testCapitalize() {
        HelloWorldController test = new HelloWorldController();
        assertEquals("", "DINASOURS ARE DANGEROUS", test.getCapitals("dinasours are dangerous"));

    }

    @Test
    public void testReverse() {
        HelloWorldController test = new HelloWorldController();
        assertEquals("","cup world",test.reverseString("world cup"));

    }
}