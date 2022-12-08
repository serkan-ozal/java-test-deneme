package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagicBuilder {

    @Test
    public void testLucky() {
        System.out.println("testLucky. ");
        assertEquals(7, MagicBuilder.getLucky());
    }

}
