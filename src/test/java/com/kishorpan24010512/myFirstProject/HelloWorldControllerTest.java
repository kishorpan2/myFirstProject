package com.kishorpan24010512.myFirstProject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
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

// Integration Tests

    @Autowired
    HelloWorldController helloWorldController;
    @Autowired
    MockMvc mockMvc;
    @Test
    public void testControllerIsAutoWired(){
       assertNotNull(helloWorldController);
    }
    @Test
    public void testIntegrationHelloWorld() throws Exception{
        mockMvc.perform(get("/")).andExpect(content().string(containsString("Hello World")));
    }
    @Test
    public void testRequestCapitals() throws Exception{
        mockMvc.perform(get("/capitalize/hello")).andExpect(content().string(containsString("HELLO")));
    }

}