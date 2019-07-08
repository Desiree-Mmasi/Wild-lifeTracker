package models;

import org.sql2o.Connection;

public class Ranger {
    private int id;
    private String rangerName;
    private Integer rangerId;
    private Integer rangerContact;
    private String rangerSighting;

    public Ranger( String mName, Integer mNumber, Integer mContact, String mSite) {
        this.rangerName= mName;
        this.rangerId = mNumber;
        this.rangerContact = mContact;
        this.rangerSighting = mSite;
    }

    public int getId () {
        return id;
    }

    public String getRangerName () {
        return rangerName;
    }

    public Integer getRangerId () {
        return rangerId;
    }

    public Integer getRangerContact () {
        return rangerContact;
    }

    public String getRangerSighting () {
        return rangerSighting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ranger)) return false;
        Ranger ranger = (Ranger) o;
        return getId() == ranger.getId() &&
                getRangerName().equals(ranger.getRangerName()) &&
                getRangerId() == ranger.getRangerId() &&
                getRangerContact() == ranger.getRangerContact() &&
                getRangerSighting().equals(ranger.getRangerSighting());
    }

    public void save() {
        String sql = "INSERT INTO animals (name, type) VALUES (:ranger, :state, :condition)";
        try(Connection con = DB.sql2o.open()) {
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("ranger", rangerName)
                    .addParameter("id", rangerId)
                    .addParameter("contact", rangerContact)
                    .addParameter("sighting", rangerSighting)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
        }
    }
}
