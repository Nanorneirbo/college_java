public class Wk5LabEx8 {
    public static void main (String[]args){
        
    int a ;
    
    a= (int)(Math.random()*31 +1);
    System.out.println(a);
    //Or operators
    if (a == 11) {
        System.out.println(a +"th");
    }    
    else if (a == 12) {
        System.out.println(a +"th");
    }
    else if (a == 13) {
        System.out.println(a +"th");
    }
    
    else if (a % 10 == 1) {
        System.out.println(a +"st");
    }
    
    else if (a % 10 == 2) {
        System.out.println(a +"nd");
    }
    
    else if (a % 10 == 3) {
        System.out.println(a +"rd");
    }
    
    else  {
        System.out.println(a +"th");
    }
}
}
