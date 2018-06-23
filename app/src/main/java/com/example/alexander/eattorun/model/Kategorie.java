package com.example.alexander.eattorun.model;

public class Kategorie {

    private String mName;
    private String mBeschreibung;
    private int mPortionsgrösse;
    private Einheit mEinheit;
    private int[] mPunktematrix;

    public Kategorie(String name, String beschreibung, int portionsgrösse, Einheit einheit, int[] punktematrix){
        mName = name;
        mBeschreibung = beschreibung;
        mPortionsgrösse = portionsgrösse;
        mEinheit = einheit;
        mPunktematrix = punktematrix;
    }
}
