package com.maventesting.app;

public class Greeter 
{
    public void greet(String name)
    {
        System.out.println(createGreeting(name));
    }

    public String createGreeting(String name){
        return "Greetings " + name + ", my master!";
    }
}
