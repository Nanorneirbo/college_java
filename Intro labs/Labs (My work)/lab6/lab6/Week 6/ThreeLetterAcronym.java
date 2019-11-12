public class ThreeLetterAcronym {
    public static void main(String[] args){
    
    String someText = "Listen Observe Learn";
    String tla;
    
tla = "" + someText.charAt(0)  
            + someText.charAt(someText.indexOf(' ') + 1) 
            + someText.charAt(someText.lastIndexOf(' ') + 1);
    
System.out.println("Three Letter Acronym -- " + tla);
    
    }
}

    