package com.company;

public abstract class CircleBase{
    protected double radius = 1;
    private String colour;


    public CircleBase(){
        radius = 1;
    }

    public CircleBase(int radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public double getRadius(){
        return radius;
    }

    public String getColour(){
        return colour;
    }

    public abstract double Area();
    public abstract double getVolume();
}

