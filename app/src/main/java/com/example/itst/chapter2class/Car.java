package com.example.itst.chapter2class;

public class Car {
    private String make;
    private String year;
    private String color;

    public  Car(){

    }
    public Car(String make, String year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
