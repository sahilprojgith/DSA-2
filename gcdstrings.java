package faqs;

public class gcdstrings {

    public static String gcdofStrings(String str1 , String str2) {

        if (str1.equals(str2)) {
            return str1;
        }

        if (str1.length() > str2.length()) {
            if (str1.startsWith(str2)) {
                return gcdofStrings(str1.substring(str2.length()), str2);
            } else {
                return "";
            }
        } else {

                if (str2.startsWith(str1)) {
                    return gcdofStrings(str1, str2.substring(str1.length()));
                } else {
                    return "";
                }
        }
    }



    public static void main(String[] args) {

        System.out.println(gcdofStrings("ABCABC","ABC"));

    }
}
