package models;

public class Species {
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

    public String getmSpecies () {
        return mSpecies;
    }

    public String getmState () {
        return mState;
    }

    public String getmCondition () {
        return mCondition;
    }
}
