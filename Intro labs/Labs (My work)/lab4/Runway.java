public class Runway{
    public static void main (String[] args){
        int takeOffspeed;
        double acceleration;
        double minimumLength;
        
        takeOffspeed = (int)(Math.random()*30+150);
        acceleration = (double)(Math.random()*1.5+3.5);
        minimumLength = (takeOffspeed*takeOffspeed)/(2*acceleration);
        
        System.out.println("Take off speed is " + takeOffspeed);
        System.out.println("Acceleration is " + acceleration);
        System.out.println("if the runeway is not " + minimumLength + " then kaboom"); 
    }
}
