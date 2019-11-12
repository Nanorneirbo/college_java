//Inheritance

//inherit commonly used things from other classes

//main
package com.company;

public class Main {

    public static void main(String[] args) {
//calling a new animal
        Animal animal = new Animal ("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1, 20, "long silky", 1);
       // dog.eat();
        //dog.walk();
        dog.run();

    }
}

Animal

 private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){ // two things all animals can do
        System.out.println("Animal eat() called");
    }

    public void move(int speed){
        System.out.println("animal is moving @" + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

DOg

package com.company;

public class Dog extends Animal {

    private int eyes; //uniques dog charachteristics added from the animal class
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int teeth, String coat, int tail) { //intellij can automatically do the constructor
        super(name, 1, 1, size, weight);                          // super is for the class we are extending from
        this.eyes = eyes;
        this.teeth = teeth;
        this.coat = coat;
        this.tail = tail;
    }

    private void chew() {

        System.out.println("dog chew called");
    }
        @Override
        public void eat () {
            System.out.println("dog eat() called");
            chew();
            super.eat();


        }
        public void walk(){

            System.out.println("Dog walk() called");
            move(5);
    }
        public void run(){
            System.out.println("Dog run(0 called");
             move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

Fish.java

package com.company;

public class Fish extends Animal {
    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) { // definied superc lass
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest(){


    }
    private void moveMuscles(){

    }
    private void moveBackFin(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
}

//class is the blueprint of the house
// each house is an object or an instance
// the address is the reference


