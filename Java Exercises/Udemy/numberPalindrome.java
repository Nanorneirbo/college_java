/*
Number Palindrome
---
** Please read this entire page before attempting to solve this coding exercise.  Additional help is available by watching the video mentioned at the bottom of the page **
---
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false. 

Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); should return true
isPalindrome(707); should return true
isPalindrome(11212); should return false because reverse is 21211 and that is not equal to 11212.
Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
Tip: Logic to check a palindrome number
Find the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse. 

If both are the same then the number is a palindrome otherwise it is not.
Tip: Logic to reverse a number
Declare and initialize another variable to store the reverse of a number, for example reverse = 0. 

Extract the last digit of the given number by performing modulo division. 
Store the last digit to some variable say lastDigit = num % 10. 
Increase the place value of reverse by one.
To increase place value multiply reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse. 
Since last digit of num is processed, remove last digit of num. To remove last digit divide num by 10. 
Repeat steps until num is not equal to (or greater than) zero.

A while loop would be good for this coding exercise.
Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).

NOTE: The isPalindrome method needs to be defined as public static like we have been doing so far in the course. 
NOTE: Do not add a  main method to solution code.
*/



package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(numberPalindrome(398));

    }

    public static Boolean numberPalindrome(int x){
        //find reverse

        int reverse =0;
        int newx = x;

        while(newx>0){
            reverse = reverse*10 + newx%10;
            newx =newx/10;
        }
        System.out.println("Reverse of number is : " + reverse);

        if(x == reverse)
            return true;
        else
            return false;
    }
}
	
	
	
	
	




