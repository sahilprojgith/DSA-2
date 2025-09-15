package faqs;

public class fibnazi { // a fibonacci series is a series of a number
    // where each number is a sum of a previous number
    public static void main(String[] args){

        int n = 10;

        System.out.println("Fibonacci Series is :");
        for(int i = 0; i<n;i++){
            System.out.println(fib(i) + " ");
        }


    }

    public static int fib(int n){
        //base cases
        if(n==0) return 0;
        if(n==1) return 1;

        //for recursive case
        return fib(n-1) + fib(n-2);


    }
    //inefficient for large numbers.
}

