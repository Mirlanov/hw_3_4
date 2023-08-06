package com.example.hw_3_4;

public class CounrtyModel {
    private String name;
    private String continentName;

    public void CountryModel(String name, String continentName) {
        this.name = name;
        this.continentName = continentName;
    }

    public String getName() {
        return name;
    }

    public String getContinentName() {
        return continentName;
    }
}
