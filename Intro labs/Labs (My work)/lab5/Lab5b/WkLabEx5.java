public class WkLabEx5 {
    public static void main (String[]args){
    
        int a;
        
        a=(int)(Math.random()*100);
        
        if (a > 80) {
            System.out.println("A score of " + a + " is graded as A");
        }
        else if (a > 70) {
            System.out.println("A score of " + a + " is graded as B");
        }
         else if (a > 55) {
            System.out.println("A score of " + a + " is graded as C");
        }
         else if (a > 40) {
            System.out.println("A score of " + a + " is graded as D");
        }
         else {
            System.out.println("A score of " + a + " is graded as E");
        }
        
            
        
    }
    
}