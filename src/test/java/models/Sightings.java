
package models;

import org.sql2o.Connection;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;

public class Sightings {
  private int id;
  private int rangerId;
  private int animalId;
  private String location;
  private Timestamp date;

    public Sightings (int id, int rangerId, int animalId, String location, Timestamp date) {
        this.id = id;
        this.rangerId = rangerId;
        this.animalId = animalId;
        this.location = location;
        this.date = new Timestamp(new Date().getTime());
    }

    public int getId () {
        return id;
    }

    public int getRangerId () {
        return rangerId;
    }

    public int getAnimalId () {
        return animalId;
    }

    public String getLocation () {
        return location;
    }
    public String getDate(){
        return DateFormat.getDateInstance().format(this.date);
    }



    public String getRangerName() {
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery("SELECT name FROM rangers WHERE id=:id")
                    .addParameter("id", this.rangerId)
                    .executeAndFetchFirst(String.class);
        }
    }
    public String getAnimalName() {
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery("SELECT name FROM species WHERE id=:id")
                    .addParameter("id", this.animalId)
                    .executeAndFetchFirst(String.class);
        }
    }

    public void save(){
        try(Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO sightings (animalId, rangerId, location, date) VALUES (:animalId," +
                    " " +
                    ":rangerId, :location, :date)";
            this.id = (int) con.createQuery(sql,true)
                    .addParameter("animalId", this.animalId)
                    .addParameter("rangerId", this.rangerId)
                    .addParameter("location", this.location)
                    .addParameter("date", this.date)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
        }
    }

}
