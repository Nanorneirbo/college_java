public class Wk5LabEx9 {
public static void main(String[]args) {
    int x1,y1,x2,y2,x3,y3;
    
    x1 =(int)(Math.random()*600+1);
    y1 =(int)(Math.random()*800+1); 
    //x1 = 100;
    //y1 = 450; these were just to test the math.random stuff
    // work out where square is
    x2 = 30;
    y2 = (600-104);
    x3 = x2 + 256;
    y3 = (y2-70);
    
    // print it so we know
    System.out.println("random numbers are "+ x1 + " " + y1);
    System.out.println("Square is " + x2 + "," + y2 + " " + x3 +"," + y3);
    
    // it statement with 2 ands
    if (((x1 >=x2)&&(x1 <= x3))&&((y1 <= y2)&&(y1 >= y3))) {
        System.out.println("inside");
    }
    else{
        System.out.println("outside");
    }
        
}
}
