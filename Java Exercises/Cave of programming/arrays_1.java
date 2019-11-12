public class Main {

    public static void main(String[] args) {

        String[] sheets;
        sheets = new String[5];


        System.out.println(sheets[4]);

        //iterate through array

        for (int i = 0; i < sheets.length; i++) {
            System.out.println(sheets[i]);
        }
        String[] workbook = {"Ronan", "is", "The", "Best"};
        for (int i = 0; i < sheets.length; i++) {
            System.out.println(workbook[i]);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        String[] words = new String[3];

        words[0]= "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"appla", "banana", "pear", "kiwi"};

        for (String fruit: fruits)

    {
        System.out.println(fruit);
    }
    }
}
public class Main {

    public static void main(String[] args) {

     int[] values = {3,5,2343};
        System.out.println(values[1]);

        int[][] grid = {
                {3, 5, 2343},
                {2,4},
                {1,2,3,4}
            };

        System.out.println(grid[1][1]);//don't forget start at 0
        System.out.println(grid[0][2]);

        String[][] texts = new String[2][3];

        texts [0][1] ="hello there";
        System.out.println(texts[0][1]);



        //iterating through 2D ARRAYS

        for( int row=0; row< grid.length; row++) {//iterate through rows first (outer array)
            for (int col = 0; col < grid[row].length; col++) { //iterate through columns
                System.out.print(grid[row][col] + "\t"); // output
            }
            System.out.println(); //nes line inside outer for loop
        }
    }
}
