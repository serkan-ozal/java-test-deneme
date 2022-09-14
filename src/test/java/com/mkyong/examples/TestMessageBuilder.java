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
        assertEquals(101, MessageBuilder.getNumber10());
    }
    
  
 
    

}
