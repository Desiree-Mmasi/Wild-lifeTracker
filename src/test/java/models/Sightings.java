
package models;

import org.sql2o.Connection;

public class Sightings {
  private int id;
  private int rangerId;
  private int animalId;
  private String location;

    public Sightings (int id, int rangerId, int animalId, String location) {
        this.id = id;
        this.rangerId = rangerId;
        this.animalId = animalId;
        this.location = location;
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
                    .addParameter("id", this.rangerId)
                    .executeAndFetchFirst(String.class);
        }
    }
    public String getLocationName() {
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery("SELECT name FROM sightings WHERE id=:id")
                    .addParameter("id", this.rangerId)
                    .executeAndFetchFirst(String.class);
        }
    }
}
