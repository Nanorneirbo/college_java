public class numberSegments {
    public static void main (String[]args){
        int a,b,c,d;
        a =(int)(Math.random()*899999999+100000000);
        
        //System.out.println("The number is " + a);
        
        //first digit
        
        b = (int)a/1000000;
        
        //System.out.println ("first digit " + b);
        
        //second digit
        
        c = (int)(a/1000)%1000;
        
        //System.out.println ("second digit " + c);
        
        d = (int)(a%1000);
        
        //System.out.println ("third digit " + d);
        
        System.out.println (b + " " + c + " " + d);
    }
}
        