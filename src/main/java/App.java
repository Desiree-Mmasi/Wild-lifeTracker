import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(new HashMap(), "index.hbs");
        }, new HandlebarsTemplateEngine());


        get("/home",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(new HashMap(), "index.hbs");
        }, new HandlebarsTemplateEngine());


        get("/ranger",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(new HashMap(), "Ranger.hbs");
        }, new HandlebarsTemplateEngine());
    }
}