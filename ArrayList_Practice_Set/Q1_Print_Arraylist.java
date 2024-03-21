package ArrayList_Practice_Set;

import java.util.ArrayList;

public class Q1_Print_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(46);
        al.add(6);
        al.add(13);
        al.add(14);
        al.add(19);
        al.add(1);
        al.add(264);
        al.add(123);

        //Threes ways to print arraylist

        for (int element: al) {   //ForEach  //1
                System.out.println(element);

        }
        System.out.println();

        for (int i = 0; i< al.size(); i++){   //for// 2
            System.out.println(al.get(i));
        }

        System.out.println(al);    //with reference //3
    }

}
