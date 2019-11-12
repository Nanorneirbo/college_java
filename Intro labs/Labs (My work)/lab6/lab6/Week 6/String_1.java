public class String_1{
    public static void main(String args[]){
        
        String s, t ;
        s = "We never knew what friends we had until we came to Leningrad";
        t = "";
        int length = s.length();
        char char1 = 'e';
        int count1, i = 0;
        
        System.out.println(s);
        System.out.println(t);
        System.out.println("A:");
        System.out.println("String is " + length + " charachters long");
        System.out.println("B:");
        System.out.println("String in upper Case:");
        System.out.println(s.toUpperCase());
        System.out.println("C:");
        System.out.println("First Five Charachters:");
        System.out.println(s.substring(0,5));
        System.out.println("D:");
        System.out.println("Last Five Charachters:");
        System.out.println(s.substring((length-5),(length)));
        System.out.println("E:");
        System.out.println("Approximately 3 quarters in:");
        System.out.println(s.substring((0),(length/4)*3));
        System.out.println("F:");
        System.out.println("make t a string with no spaces:");
        t= s.replaceAll("\\s","");
        System.out.println(t);
        System.out.println("G:");
        System.out.println("Halfway Charachter?");
        System.out.println(s.charAt(length/2));
        System.out.println("H:");
        System.out.println("How many e's:");
        for(i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == char1){
                count1++;
            }
        }
        System.out.println("There are " + i + " " + char1 + "'s");
    }
}

        
