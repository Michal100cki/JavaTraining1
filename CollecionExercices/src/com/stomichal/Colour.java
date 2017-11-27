package com.stomichal;

public class Colour {

  private   String mainKind;
    private String company;
    private String name;


    public Colour(String mainKind, String company, String name) {
        this.mainKind = mainKind;
        this.company = company;
        this.name = name;

    }

    public String getMainKind() {
        return mainKind;
    }

    public void setMainKind(String mainKind) {
        this.mainKind = mainKind;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean sprawdzenie(){
        if(!Colour.this.getName().isEmpty()){

        }

        return true;
    }
}








