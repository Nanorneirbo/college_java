public class DistanceV1 {
    public static void main (String args[]){
     //point 4,7 declaring two integers
     int x1 = (int)(Math.random()*5 + 2);
     int y1 = (int)(Math.random()*3 + 11);
     //point 12,8
     int x2 = (int)(Math.random()*5 +2);
     int y2 = (int)(Math.random()*3 + 11);
     // difference
     int diffXs = x2-x1;
     int diffYs = y2-y1;
     double d = Math.sqrt((diffXs*diffXs)+(diffYs*diffYs));
     System.out.println ("Point 1 is " + x1 + "," + y1);
     System.out.println ("Point 2 is " + x2 + "," + y2);
     System.out.println ("The distance between them is " + d);
    }
}