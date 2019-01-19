package com.example.itst.chapter2class;

public class Car {
    private String make;
    private String year;
    private String color;
    private String fuel;

    public Car(String make, String year, String color, String fuel) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.fuel = fuel;
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

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
