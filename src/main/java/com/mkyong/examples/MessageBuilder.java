package com.mkyong.examples;

public class MessageBuilder {

    public static String getHelloWorld(){
        return "hello world";
    }

    public static int getNumber10(){
        try {
            Thread.sleep(10);
        } catch (Exception ex) {}
        return 10;
    }
    
    public static int getNumber20(){
        try {
            Thread.sleep(20);
        } catch (Exception ex) {}
        return 20;
    }

}
