public class wk5LabEx1 {
    public static void main(String[] args) {
        int a, b, c, d, min, max, temp ;
        double avg, y;
        
        a = (int) (Math.random() *100 + 1) ;
        b = (int) (Math.random() *100 + 1) ;
        c = (int) (Math.random() *100 + 1) ;
        
       min = a ;
       
       if(b < min) {
            min = b ;
        }
       if(c < min) {
            min = c;
        }
       
       System.out.println("min is " + min);
        
       max = a ;
       if(b > max) {
           max = b ;
        }
       if(c > max) {
            max = c ;
        }
       
       System.out.println("max is " + max);
       
       avg = ((a+b+c))/3.0;
       
       System.out.println("avg is " + avg);
    
       if(a > b) {
           temp = a ;
           a = b ;
           b = temp;
        }
       if(b > c) {
           temp = b ;
           b = c ;
           c = temp ;
        }
       if (b < a) {
           
       
    }
}

