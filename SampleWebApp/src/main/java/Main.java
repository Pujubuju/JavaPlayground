import controllers.HelloController;

import javax.xml.ws.Endpoint;

//public class Main {

    //public static void main(String[] args){
    //    Endpoint.publish("http://localhost:51000/hello", new HelloController());
    //}

//}

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
