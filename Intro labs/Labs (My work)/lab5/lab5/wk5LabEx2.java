public class wk5LabEx2 {
    public static void main(String[] args) {

    int n1, n2;
    
    n1 = (int)(Math.random()*45+45);
    n2 = (int)(Math.random()*45+45);
    
    if (n1 > n2){
        System.out.println(1);
    }
    if (n1==n2){
        System.out.println(0);
    }
    if (n1 < n2){
        System.out.println(-1);
    }
}
}