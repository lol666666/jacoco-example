package com.jacoco;

public class HelloWorldJacoco {
    public String getMessage(boolean bigger) {
        if (bigger) {
            return "Hello Universe!";
        } else {
            return "Hello World!";
        }
    }

}
