
package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = integer.MAX_VALUE;
        int max = integer.MAX_VALUE;
        boolean first = true; // way to get the first min and max to the new number
        while (true) {
            System.out.println("Enter Number : ");
            boolean isAnInt = scanner.hasNextInt();


            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    min = number;
                    max = number;
                    first = false;
                }

                if (number > max){
                    max = number;
                }
                if (number<min) {
                    min = number;
                }
                System.out.println("Minimum is: " + min + " Maximum is: " + max);
            }
            else{
                System.out.println("Invalid Number");
                break;//break out if the value is not an int
            }
            scanner.nextLine();
        }

        scanner.close();


    }
} 
