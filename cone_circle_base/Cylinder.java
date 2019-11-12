package com.company;

public class Cylinder extends CircleBase implements Comparable<Cylinder>{

    private double height;
    private double volume;

    public Cylinder(){
        height = 1;
        radius = 1;
    }

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;

    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){

        return height;
    }

    private void calcVolume(){

        volume = (Math.PI*radius*radius)*(height);

    }

    public double getVolume(){
        calcVolume();
        return volume;

    }

    public double Area(){
        Double area;
        area =((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
        return area;

    }
    public int compareTo(Cylinder c){
        if(this.getVolume() > c.getVolume()){return 1;}
        if(this.getVolume() < c.getVolume()){return -1;}
        System.out.println("Cylinder comparison");

        return 0;
    }
    public int compareTo(Cone c){
        if(this.getVolume() > c.getVolume()){return 1;}
        if(this.getVolume() < c.getVolume()){return -1;}
        return 0;
    }

}