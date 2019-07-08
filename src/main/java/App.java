import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import models.*;
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


        post("/done", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Ranger> ranger =request.session().attribute("ranger");
            if (ranger==null) {
                ranger= new ArrayList<Ranger>();
                request.session().attribute("ranger",ranger);
            }
            String inputtedRanger = request.queryParams("name");
            String  inputtedNumber = request.queryParams("number");
            int number =    Integer.parseInt(inputtedNumber);
            String inputtedContact = request.queryParams("contact");
            int contact = Integer.parseInt(inputtedContact);
            String inputtedSighting = request.queryParams("site");

            Ranger named = new Ranger(inputtedRanger, number, contact, inputtedSighting);
            ranger.add(named);
            model.put("hero", named);
            return new ModelAndView(model, "Ranger.hbs");
        }, new HandlebarsTemplateEngine());


        get("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(new HashMap(), "Sightings.hbs");
        }, new HandlebarsTemplateEngine());


        get("/feedback", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(new HashMap(), "Feedback.hbs");
        }, new HandlebarsTemplateEngine());

        get("/species", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(new HashMap(), "Species.hbs");
        }, new HandlebarsTemplateEngine());

        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(new HashMap(), "Sightingsform.hbs");
        }, new HandlebarsTemplateEngine());

    }
}