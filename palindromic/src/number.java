import java.util.Scanner;

public class jimbo {

    private int numbertest;

    public int getNumbertest() {
        return numbertest;
    }

    public void setNumbertest(int numbertest) {
        this.numbertest = numbertest;
    }
    public String isPallindrome(int numbertest) {
        int reversed = 0;
        int original = numbertest;
        while (numbertest != 0) {
            reversed = numbertest % 10;
            numbertest = numbertest / 10;
        }
        if (reversed == original){
            return (original + " is a Pallindrome");
        }
        else{
            return (original + "is not a Pallindrome");
        }
    }
}
