package ArrayList_Practice_Set;

import java.util.HashSet;

public class Q5_Set_Try_ro_store_Duplicate_element {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(14);
        hs.add(02);
        hs.add(97);
        hs.add(14);   //duplicate element
        hs.add(1);

        for (int e: hs) {
            System.out.println(e);    //14%5 = remainder 4 will set 14 on 4th position
                                      //97/5 leaves 3 remainder which is the least amongst the number in the hashset
                                      //so, it will be placed at posistin 1 index 0

        }

    }
}
