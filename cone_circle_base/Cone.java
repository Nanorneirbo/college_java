
package com.company;

public class Cone extends CircleBase implements Comparable<Cone>{

    private double height;
    private double volume;

    public Cone(){
        height = 1;
        radius = 1;
    }

    public Cone(int radius, int height){
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

        volume = (Math.PI*radius*radius)*(height/3);

    }

    public double getVolume(){
        calcVolume();
        return volume;
    }
    public double Area(){
        Double area;
        area = Math.PI*radius*(radius + Math.sqrt(height* height * radius* radius));
        return area;

    }
    public int compareTo(Cone c){
        if(this.getVolume() > c.getVolume()){return 1;}
        if(this.getVolume() < c.getVolume()){return -1;}
        return 0;
    }
    public int compareTo(Cylinder c){
        if(this.getVolume() > c.getVolume()){return 1;}
        if(this.getVolume() < c.getVolume()){return -1;}
        return 0;
    }
}
