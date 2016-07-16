package controllers;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;

@WebService
public class HelloController {


    private String message = "Hello, ";

    public void HelloController() {}

    @WebMethod
    @GET
    public String sayHello(String name) {
        return message + name + ".";
    }

}
