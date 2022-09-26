package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
        assertEquals("hello world1", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        try { Thread.sleep(1000);} catch(Exception ex) {}
        assertEquals(101, MessageBuilder.getNumber10());

    }
    
  
 
    

}
