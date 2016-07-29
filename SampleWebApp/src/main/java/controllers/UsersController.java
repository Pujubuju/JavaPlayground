package controllers;

import com.google.inject.Inject;
import services.IUsersService;
import spark.Request;
import spark.Response;
import transformers.JsonTransformer;

import static spark.Spark.*;

public class UsersController {

    private final IUsersService _usersService;

    @Inject
    public UsersController(IUsersService usersService){
        _usersService = usersService;
        get("/users", (Request req, Response res) -> {
            res.type("application/json");
            return  _usersService.getAll();
        }, new JsonTransformer());
    }
}
