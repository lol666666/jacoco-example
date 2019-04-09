package com.jacoco.test;

import com.jacoco.HelloWorldJacoco;
import org.junit.Before;
import org.junit.Test;



import static junit.framework.TestCase.assertEquals;


public class HelloWorldTest {


    private HelloWorldJacoco subject;

    @Before
    public void setup() {
        subject = new HelloWorldJacoco();
    }

    @Test
    public void testGetMessage() {
        assertEquals("Hello World!", subject.getMessage(false));
    }

    @Test
    public void testGetMessage_one(){
        assertEquals("Hello Universe!",subject.getMessage(true));
    }
}
