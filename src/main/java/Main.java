import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;

public class Main {

    static ArrayList<String> movies = new ArrayList<>();

    // TO-DO

    public static void main(String[] args) {

        
        movies.add("Star Wars");
        movies.add("Avengers");

        Javalin app = Javalin.create().start(4100);
        
        app.get("/", ctx -> ctx.result("Hello World!"));

        app.get("/movies", movieHandler);

    }

    public static Handler movieHandler = ctx -> {

        movies.add("Spider-Man");
        
        ctx.result(movies.toString());

    };

    public static Handler characterHandler = ctx -> {

        // TO-DO
        
        
    };

}
