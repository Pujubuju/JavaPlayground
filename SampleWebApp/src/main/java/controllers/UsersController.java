package controllers;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

public class UsersController {

    public UsersController(){
        get("/users", (Request req, Response res) -> {
            return "Users";
        });
    }
}
