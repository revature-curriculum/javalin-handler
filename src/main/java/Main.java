import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;

public class Main {

    static ArrayList<String> movies = new ArrayList<>();

    static ArrayList<String> characters = new ArrayList<>();

    public static void main(String[] args) {

        movies.add("Star Wars");
        movies.add("Avengers");

        Javalin app = Javalin.create().start(4100);
        
        app.get("/", ctx -> ctx.result("Hello World!"));

        app.get("/movies", movieHandler);

        app.get("/favcharacters", characterHandler);

    }

    public static Handler movieHandler = ctx -> {

        movies.add("Spider-Man");
        
        ctx.result(movies.toString());

    };

    public static Handler characterHandler = ctx -> {

        characters.add("Iron Man");
        characters.add("Jinx");
        characters.add("Hagrid");
        characters.add("Conan");

        ctx.result(characters.toString());
        
    };

}
