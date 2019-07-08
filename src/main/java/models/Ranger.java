package models;

import org.sql2o.Connection;

import java.util.List;

public class Ranger {
    private int id;
    private String rangerName;
    private String rangerGender;
    private Integer rangerBadge;
    private Integer rangerContact;
    private String rangerSighting;

    public Ranger( String mName, String mGender, Integer mBadge,Integer mContact, String mSite) {
        this.rangerName= mName;
        this.rangerGender = mGender;
        this.rangerBadge = mBadge;
        this.rangerContact = mContact;
        this.rangerSighting = mSite;
    }

    public int getId () {
        return id;
    }

    public String getRangerName () {
        return rangerName;
    }

    public String getRangerGender () {
        return rangerGender;
    }

    public Integer getRangerBadge () {
        return rangerBadge;
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
                getRangerGender().equals(ranger.getRangerGender()) &&
                getRangerBadge() == ranger.getRangerBadge() &&
                getRangerContact() == ranger.getRangerContact() &&
                getRangerSighting().equals(ranger.getRangerSighting());
    }

    public void save() {
        String sql = "INSERT INTO rangers (name, gender, badge, contact, site) VALUES (:ranger, :gender,:badge, :contact, :sighting)";
        try(Connection con = DB.sql2o.open()) {
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("ranger", rangerName)
                    .addParameter("gender", rangerGender)
                    .addParameter("badge", rangerBadge)
                    .addParameter("contact", rangerContact)
                    .addParameter("sighting", rangerSighting)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
        }
    }
//
//    public static List<Ranger> all(){
//        try(Connection con = DB.sql2o.open()) {
//            return con.createQuery("SELECT * FROM rangers")
//                    .executeAndFetch(Ranger.class);
//        }
    }

