import controllers.HelloWorldController;
import controllers.UsersController;
import spark.Spark;
import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        configureServer();
        RegisterControllers();
    }

    private static void configureServer() {
        port(51000);
        int maxThreads = 8;
        threadPool(maxThreads);
        Spark.staticFileLocation("/public");
    }

    private static void RegisterControllers() {
        new HelloWorldController();
        new UsersController();
    }
}
