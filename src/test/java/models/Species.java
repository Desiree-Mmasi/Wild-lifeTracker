package models;

import org.sql2o.Connection;

public class Species {
    private int id;
    private String mSpecies;
    private String mState;
    private String mCondition;

    public Species (String mSpecies, String mState, String mCondition) {
        this.mSpecies = mSpecies;
        this.mState = mState;
        this.mCondition = mCondition;
    }

    public Species (String tiger, String endangered) {
    }

    public int getId(){
        return id;
    }

    public String getmSpecies () {
        return mSpecies;
    }

    public String getmState () {
        return mState;
    }

    public String getmCondition () {
        return mCondition;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Species)) return false;
         Species species = (Species) o;
        return getId() == species.getId() &&
                getmSpecies().equals(species.getmSpecies()) &&
                getmState().equals(species.getmState()) &&
                getmCondition().equals(species.getmCondition());
    }

    public void save() {
        String sql = "INSERT INTO animals (name, type) VALUES (:species, :state, :condition)";
        try(Connection con = DB.sql2o.open()) {
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("species", mSpecies)
                    .addParameter("state", mState)
                    .addParameter("condition", mCondition)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
        }
    }
}
