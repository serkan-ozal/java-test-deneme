package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testHelloWorld() {
        System.out.println("testHelloWorld");
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        System.out.println("testNumber10");
        try { Thread.sleep(1000);} catch(Exception ex) {}
        assertEquals(10, MessageBuilder.getNumber10());
    }
}
