public class Category {
public static void main (String[] args){

    int n1;
    int n2;
    
    n1 = (int)((Math.random()*45)+45);
    n2 = (int)((Math.random()*45)+45);
    
    System.out.println(n1);
    System.out.println(n2);
    
    if (n1>n2){
    System.out.println(1);    
    }
    
    if (n1==n2){
        System.out.println(0);
    }
    if (n2>n1){
        System.out.println(-1);
    }
}
}    
