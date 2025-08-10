package faqs;

import java.util.HashSet;

public class vowelsusingHashSet {
    public static void main(String[] args) {
        String str= "Fearow Jackson";
        str = str.toLowerCase();

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(vowels.contains(ch)){
                count++;
            }
        }
        System.out.println("Number of vowels" + count);

    }
}
