package com.company;

        class Person{
            // Instance variables (data or "state)
            String name;
            int age;


            //classes can contain

            // 1. Data(instance variables) eg name, location, mood, age, etc
            // 2. Sub routines or methods // can type commands

        }

        class Team{
            String name;
            int wins;
            int losses;
            int draws;
        }



            public class Main {

                public static void main(String[] args) {

                    Person person1 = new Person();
                    person1.name = "Joe Bloggs";
                    person1.age = 37;

                    Person person2 = new Person();
                    person2.name = "Sarah Smith";
                    person2.age = 20;

                    System.out.println(person2.name);

                Team Arsenal = new Team();
                Arsenal.name = "Arsenal";
                Arsenal.wins = 26;
                Arsenal.losses = 0;
                Arsenal.draws= 12;

                    System.out.println("Arsenals record :" +Arsenal.wins + Arsenal.losses + Arsenal.draws);

                }
    }
