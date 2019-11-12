port javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        while ( i <= 10){
            System.out.println("Enter Number " +i);
            Scanner scanner = new Scanner(System.in);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt)
            {
                int x = scanner.nextInt();
                scanner.nextLine();
                sum = sum + x;
            }
            else
                System.out.println("Invalid Value");
            i++;
        }
        System.out.println("The total is : " + sum);




    }
}