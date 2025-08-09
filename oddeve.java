package faqs;

public class oddeve {
    public static void main(String[] args){

        int num = 8;

        if(num % 2 == 0){
            System.out.println( num + " - it's a even number");
        }else {
            System.out.println(num + "it's a odd number");
        }
        //why not .equals()
        /*

        .equals() is used for Objects, like: String, Integer, ArrayList, etc. // primitives don;t have methods
        Primitive values (int, etc.)	== used when comparing primitive values
        Behavior:
    For primitives: compares actual values

    imp - For objects: compares memory locations
    String s1 = "hello";
    String s2 = "hello";

    System.out.println(s1 == s2);       //  true (both point to same string literal in String Pool)
    System.out.println(s1.equals(s2));  //  true (compares actual content)

         */


    }



}
