package faqs;

public class reversevowels {

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1; // This is a helper function

        /*
        aeiouAEIOU is a string containing all vowels,
        because we want quick access to all vowels, .index(c)
        gives the index c if it exists, otherwise return -1

        If c is a vowel → returns index (>= 0).
        If c is not a vowel → returns -1.
         */
    }


    public static String reverse(String s){
        char[]  chars = s.toCharArray();
        //strings are immutable so convert the string into a char[]


        int left = 0 , right = chars.length -1;// two pointer method

        while (left<right){ // Continue until pointers meet or cross

            while (left<right && !isVowel(chars[left])){ //Stop when chars[left] is a vowel
                left++;

            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            char temp = chars[left]; // excange the characters
            chars[left] = chars[right];
            chars[right] = temp; //vowel from left has been swapped with vowel from right.

            left++;
            right--;

//            After swapping, move to the next positions.
//            Repeat the process until no more swaps needed.
        }
        return new String(chars);

    }


    public static void main(String[] args) {




    }
}
