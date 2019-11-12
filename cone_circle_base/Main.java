package com.company;

public class Main{

    public static void main(String args[]){

        int numShapes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of shapes you want to make"));
        System.out.println(numShapes);

        // circle base array - now defunct
        CircleBase[] newArray = new CircleBase[numShapes];
        int i;
        String type = "";
        int radius;
        int height;
        for(i=0; i<numShapes; i++){
            type = JOptionPane.showInputDialog(null, "Value : " + (i + 1) + " Enter o for Cone or y for Cyl");

            //check the input is o or y
            while(!((type.equalsIgnoreCase("o"))||(type.equalsIgnoreCase("y")))){
                JOptionPane.showMessageDialog(null, "Please enter o for cone or y for Cylinder");
                type = JOptionPane.showInputDialog(null, "Value : " + (i + 1) + " Enter o for Cone or y for Cyl");


            }
            radius = Integer.parseInt(JOptionPane.showInputDialog(null, "What Radius do you want?"));
            height = Integer.parseInt(JOptionPane.showInputDialog(null, "What Height do you want?"));



            if(type.equals("o")){
                newArray[i] = new Cone(radius, height);
            }
            else{
                newArray[i] = new Cylinder(radius, height);
            }

        }
        //array of doubles
        Double[] volumeArray = new Double[numShapes];

        for( i =0; i<numShapes; i++){
            volumeArray[i] = newArray[i].getVolume();
            System.out.println(i + " volume Value : " + volumeArray[i]);
        }

        java.util.Arrays.sort(volumeArray);
        //print array test
        for( i =0; i<numShapes; i++){

            System.out.println(i + " Sorted volume Value : " + volumeArray[i]);
        }

        String smallestType;
        String largestType;
        if(newArray[0] instanceof Cone){
            smallestType = "cone";
        }
        else{
            smallestType = "cylinder";
        }
        if(newArray[numShapes-1] instanceof Cone){
            largestType = "cone";
        }
        else{
            largestType = "cylinder";
        }

        //find smallest position

        System.out.println(" Smallest is a " + smallestType + " with a Volume of : " + volumeArray[0]);

        System.out.println(" Largest is a  "+ largestType + " with a Volume of : " + volumeArray[numShapes-1]);





    }


}