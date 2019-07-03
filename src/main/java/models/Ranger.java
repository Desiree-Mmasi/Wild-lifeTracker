package models;

public class Ranger {
    private String rangerName;
    private Integer rangerId;
    private Integer rangerContact;
    private String rangerSighting;

    public Ranger(String mName, Integer mNumber, Integer mContact, String mSite) {

        this.rangerName= mName;
        this.rangerId = mNumber;
        this.rangerContact = mContact;
        this.rangerSighting = mSite;
    }

    public String getRangerName () {
        return rangerName;
    }

    public Integer getRangerId () {
        return rangerId;
    }

    public Integer getRagerContact () {
        return rangerContact;
    }

    public String getRangerSighting () {
        return rangerSighting;
    }
}
