
package com.company;

class Person{
    // Instance variables (data or "state)
    String name;
    int age;
    // give them behaviour --method
    void speak() {
        for( int i=0; i<3;i++)
        System.out.println("My name is " + name + " and i am " + age + " years old.");
    }
    void poop() {
        System.out.println("My anme is " + name +" and i have pooped");
    }
}


public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak();  //calling the method from above
        person1.poop();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();
        person2.poop();
        }
}

/*
My name is Joe Bloggs and i am 37 years old.
My name is Joe Bloggs and i am 37 years old.
My name is Joe Bloggs and i am 37 years old.
My anme is Joe Bloggs and i have pooped
My name is Sarah Smith and i am 20 years old.
My name is Sarah Smith and i am 20 years old.
My name is Sarah Smith and i am 20 years old.
My anme is Sarah Smith and i have pooped
*/

//More on Methods 
// Getters - COP.

class Person{
    // Instance variables (data or "state)
    String name;
    int age;
    // give them behaviour --method
    void speak() {
        for( int i=0; i<3;i++)
        System.out.println("My name is " + name + " and i am " + age + " years old.");
    }
    void poop() {
        System.out.println("My anme is " + name +" and i have pooped");
    }

    int calculateYearstoRetirement(){
        int yearsLeft = 65-age;
        return yearsLeft;
    }

    int getAge() {
        return age;
    }
    String getName(){
        return name;
    }
}


public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        //person1.speak();  //calling the method from above
        //person1.poop();

        int years = person1.calculateYearstoRetirement();

        //System.out.println("I have " + years + " years to retirement.");
        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}



