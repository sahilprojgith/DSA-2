package faqs;

public class Palindrome {
    public static void main(String[] args){
        //A palindrome is a word, number, or sequence that reads the same forwards and backwards.

        String str = "madam";
        String original  = str;

        String reverse = " ";

        for(int i = str.length() - 1; i>=0 ;i--){
            reverse = reverse + str.charAt(i);
        }

        if(original.equals(reverse)){ // practical use of .equals()
            System.out.println(original + "is a palindrome");
        }else {
            System.out.println(original + "is not a palindrome");
        }


    }
}

