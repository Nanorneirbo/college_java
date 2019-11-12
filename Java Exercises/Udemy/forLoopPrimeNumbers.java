public class Main {

    public static void main(String[] args) {
        
        int count =0;
        for (int i = 3; i <= 100; i++) {
            if (isPrime(i) == true) {
            System.out.println(i + " is a prime number");
            count++;
            if(count >= 3)
                    break;
            }

        }
    }
// is Prime method
    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
            return false;
            }
        }
    return true;

    }
}