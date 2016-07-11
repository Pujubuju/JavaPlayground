package helloworld.main;

import helloworld.greeters.Greeter;
import helloworld.algorithms.*;

class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Greeter greeter = new Greeter();
        greeter.greet();

        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Fibonacci = " + fibonacci.calculate(3));
    }
}