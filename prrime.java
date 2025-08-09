package faqs;

public class prrime { // prime number check
    public static void main(String[] args) {
        // a prime number is a number greater than 1,
        // important point - and has no divisors other than 1 and itself. eg - 1,3,5,7,11
        int num = 7;

        if (isPrimeNo(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static boolean isPrimeNo(int num) {
        if (num <= 1) {
            return false;  // just a method that specifies 1, 0, and negatives are not prime.
        }

        for (int i = 2; i < num; i++) { // don't use i <= num
            if (num % i == 0) {
                return false;
            }
        }
        return true;

        /*
        If I pass 7 in the main method to the isPrimeNo(int num) function, and inside it we
        loop from i = 2 to i < num, how does it know if it’s prime? What's the logic behind num % i == 0?

        You pass 7 into isPrimeNo(7)
        so it's the method idiot. num
         */

    }
}








