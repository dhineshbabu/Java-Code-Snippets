package com.kanu;

public class Case {

    private String model;
    private String manufactuerer;
    private String powerSupply;
    private Dimensions dimension;

    public Case(String model, String manufactuerer, String powerSupply, Dimensions dimension) {
        this.model = model;
        this.manufactuerer = manufactuerer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufactuerer() {
        return manufactuerer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
