package faqs;

public class revwordsstring {

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder stringBuilder = new StringBuilder();
        int i = s.length() - 1;
        int j = i;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

        stringBuilder.append(s.substring(i + 1, j + 1)).append(" ");

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        j = i;


    }
        return stringBuilder.toString().trim();

    }



   public static void main(String[] args) {
        revwordsstring rev = new revwordsstring();

        String s1 = "Hi I am Sahil More";
        String s2 = "   hello   world   ";
        String s3 = "the sky is blue";

        System.out.println(rev.reverseWords(s1)); // Output: "More Sahil am I Hi"
        System.out.println(rev.reverseWords(s2)); // Output: "world hello"
        System.out.println(rev.reverseWords(s3)); // Output: "blue is sky the"
    }
}

