package com.company;

class Robot{
    public void speak(String text){
        System.out.println(text);
    }

    public void jump(int height){
        System.out.println("jumping " + height);
    }

    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " metres in direction " + direction);
    }
}

public class Main {

    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Hi I am sam.");
        sam.jump(8);
        sam.move("west", 13.6);
    }

}
