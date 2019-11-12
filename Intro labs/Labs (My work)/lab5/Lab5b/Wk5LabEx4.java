public class Wk5LabEx4 {
    public static void main (String [] args){
    
    int a,b ;
    
    a = (int)(Math.random()*350000 + 50000);
    
    if (a < 100000){
         b = (int)(a*.02);
        }
    if (a < 150000){
         b = (int)(a*.05);
        }
    if (a < 200000){
        b = (int)(a*.075);
    }
    if (a < 250000){
        b = (int)(a*.1);
    }
    else {
        b = (int)(a*.125);
    }

    System.out.println("A property valued at " + a +" attracts stamp duty of " + b);
        
    }
}
        