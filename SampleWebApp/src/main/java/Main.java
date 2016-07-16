import spark.Request;
import spark.Response;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        configureServer();

        get("/hello", (Request req, Response res) -> {
            return "Hello World";
        });
    }

    private static void configureServer() {
        port(51000);

        int maxThreads = 8;
        threadPool(maxThreads);
    }
}
