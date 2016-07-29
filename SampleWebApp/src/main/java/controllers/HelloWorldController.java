package controllers;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

public class HelloWorldController {
    public HelloWorldController(){
        get("/hello", (Request req, Response res) -> {
            return "Hello World";
        });
    }
}
