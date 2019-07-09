import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import models.*;
import org.sql2o.Connection;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
    public static void main(String[] args) {

        port(getHerokuAssignedPort());
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
            String inputtedRanger = request.queryParams("name");
            String inputtedGender = request.queryParams("gender");
            String inputtedContact = request.queryParams("contact");
            String inputtedBadge = request.queryParams("badge");
            int contact = Integer.parseInt(inputtedContact);
            int badge = Integer.parseInt(inputtedBadge);
            String inputtedSighting = request.queryParams("site");

            Ranger named = new Ranger(inputtedRanger, inputtedGender,badge, contact,
                    inputtedSighting);
            named.save();
            model.put("ranger", named);
            return new ModelAndView(model, "Success.hbs");
        }, new HandlebarsTemplateEngine());


        get("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(new HashMap(), "Sightings.hbs");
        }, new HandlebarsTemplateEngine());

        post("/site", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String inputtedRangerId = request.queryParams("name");
            int ranger = Integer.parseInt(inputtedRangerId);
            String inputtedAnimalId = request.queryParams("animal");
            int animal = Integer.parseInt(inputtedAnimalId);
            String inputtedLocation = request.queryParams("location");
            Sightings named = new Sightings(ranger,animal,inputtedLocation);
            named.save();
            model.put("sighting", named);
            return new ModelAndView(model, "Success2.hbs");
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


        post("/animal", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String inputtedSpecies =
                    request.queryParams("name");
            String inputtedState =
                    request.queryParams("type");
            String inputtedCondition =
                    request.queryParams("condition");
            Species named = new
                    Species(inputtedSpecies,inputtedState,inputtedCondition);
            named.save();
            model.put("species", named);
            return new ModelAndView(model, "Success3.hbs");
        }, new HandlebarsTemplateEngine());

    }

}