package controllers;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

public class HelloWorldController {
    public HelloWorldController(){
        get("/hello/:name", (Request req, Response res) -> {
            return "Hello "  + req.params(":name") + "! :)";
        });
    }
}
