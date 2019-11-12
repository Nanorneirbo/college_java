public class Wk5LabEX6 {
    public static void main (String[] args){
        int a;
        
        a = (int)(Math.random()*63);
        
        if (a<1){
            System.out.println(a + "meter per second wind so it is Calm");
        }
        else if (a<3) {
            System.out.println (a + "meter per second wind so it is Light air");
 
        }
        else if (a<27) {
        System.out.println (a + "meter per second wind so it is Breeze");
        }
        else if (a<47) {
        System.out.println (a + "meter per second wind so it is a Gale");
        }
        else if (a < 63) {
        System.out.println(a + "meter per second wind so it is Stromy");
        }
    }
}