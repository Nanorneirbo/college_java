public class NumbersV0 {

public static void main (String[]args){
    
    int a,b,c,d,e;
    
    a = (int)(Math.random()*252+179);
    
    System.out.println("The three digit number is " + a);
    // last digit
    b = a%10;
    System.out.println("The third digit is " + b);
    c = (int)((a/10)%10);
    System.out.println("The second digit is " + c);
    d = (int)a/100;
    System.out.println("The first digit is " + d);
    e = b+c+d;
    System.out.println("The sum of the three digits is " + (e));
    
    System.out.println ("the mod 7 of the sum is " + (e%7));
    
}
}
