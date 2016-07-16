package com.maventesting.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GreeterTest
    extends TestCase
{
    public GreeterTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( GreeterTest.class );
    }

    public void testApp()
    {
        Greeter greeter = new Greeter();
        String greeting = greeter.createGreeting("Dracula");
        assertEquals(greeting, "Greetings Dracula, my master!");
    }
}
