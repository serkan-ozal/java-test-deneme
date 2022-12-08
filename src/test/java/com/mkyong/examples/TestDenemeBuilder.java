package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDenemeBuilder {

    @Test
    public void testDeneme1() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testDeneme2() {
        try { Thread.sleep(1000*3);} catch(Exception ex) {}
        assertEquals(100, MessageBuilder.getNumber10());
    }
    
    @Test
    public void testDeneme3() {
        try { Thread.sleep(100*3);} catch(Exception ex) {}
        assertEquals(100, MessageBuilder.getNumber10());
    }
    
     
    @Test
    public void testDeneme4() {
        try { Thread.sleep(100*9);} catch(Exception ex) {}
        assertEquals(10, MessageBuilder.getNumber10());
    }
    
      
    @Test
    public void testDeneme5() {
        try { Thread.sleep(100*9);} catch(Exception ex) {}
        assertEquals(1002, MessageBuilder.getNumber10());
    }
    
    @Test
    public void testDeneme6() {
        try { Thread.sleep(100*3);} catch(Exception ex) {}
        assertEquals(100, MessageBuilder.getNumber10());
    }
}
