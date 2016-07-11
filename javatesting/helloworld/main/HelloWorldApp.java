package helloworld.main;

import helloworld.greeters.Greeter;

class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Greeter greeter = new Greeter();
        greeter.greet();
    }
}