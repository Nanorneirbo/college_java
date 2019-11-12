public class Main {
// add up the digits of a number
// return -1 if it is less than 10
    public static void main(String[] args) {

        System.out.println(sumDigits(398));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(456789));

    }
    public static int sumDigits(int x){
        int remainder;
        int sum = 0;

        if(x>10)
        {
            while (x > 0 ){	//nb > not >==
                remainder = x%10;
                sum = sum + remainder;
                x = x/10;
            }
            return sum;
        }
        else
            return -1;

    }
}