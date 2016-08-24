package com.teamtreehouse.golfscorecard;

public class Hole {
    private String mLabel;
    private int mStrokeCount;

    public Hole (String label, int strokeCount) {
        mLabel = label;
        mStrokeCount = strokeCount;
    }


    public int getStrokeCount() {
        return mStrokeCount;
    }

    public void setStrokeCount(int strokeCount) {
        mStrokeCount = strokeCount;
    }

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String label) {
        mLabel = label;
    }
}
