package faqs;

import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(1,"Shell more");
        hmap.put(2,"Krishna magesh");
        hmap.put(3,"Simant Khatua"); //creates a table.

        System.out.println(hmap);


        String teacher = hmap.get(3);
        System.out.println(teacher);

        System.out.println(hmap.containsKey(4));
        System.out.println(hmap.containsValue("Simant Khatua"));

        for(int i : hmap.keySet()){
            System.out.println(hmap.get(i));
        }


    }
}
