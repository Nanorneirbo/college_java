//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //system.in allows you to ype input into the console
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        scanner.close();// give back the scanner (let it be used again)
    }
}

// add reading in an age line 29 is important for how it handles enter and next line 


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //system.in allows you to ype input into the console
        System.out.println("Enter your birth year :");
        int yearOfBirth = scanner.nextInt(); // see the integer
        scanner.nextLine();
        //need to add another call to next line becuase the system sees enter as the next line

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;

        System.out.println("Your age is : " + age);

        System.out.println("Your name is " + name);

        scanner.close();// give back the scanner (let it be used again)




    }
}

//problems and solutions

//what happens if they use -1 or if they put in letters??
// add some check conditions


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //system.in allows you to ype input into the console
        System.out.println("Enter your birth year :");
        int yearOfBirth = scanner.nextInt(); // see the integer
        scanner.nextLine();
        //need to add another call to next line becuase the system sees enter as the next line

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        int age = 2018 - yearOfBirth;

        if(age>=0 && age<=100){
            System.out.println("Your age is : " + age);

            System.out.println("Your name is " + name);
        }
        else
            System.out.println("Thats not the right age stupid.");


        scanner.close();// give back the scanner (let it be used again)




    }
}

// if you use letters in an age bracket 

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //system.in allows you to ype input into the console
        System.out.println("Enter your birth year :");

        boolean hasNextInt = scanner.hasNextInt(); // hasNextInt function checks that its an integer
        if(hasNextInt)
        {
            int yearOfBirth = scanner.nextInt(); // see the integer
            scanner.nextLine();
            //need to add another call to next line becuase the system sees enter as the next line

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your age is : " + age);

                System.out.println("Your name is " + name);
            } else
                System.out.println("Thats not the right age stupid.");

        } else
            {
            System.out.println("Not a number you dumbass");
        }
        scanner.close();// give back the scanner (let it be used again)




    }
}


