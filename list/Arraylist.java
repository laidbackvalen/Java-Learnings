package list;


import java.util.ArrayList;
//ArrayList is a part of the collection framework.
// It is present in the java.util package and provides us dynamic arrays in Java.
// Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
// We can dynamically add and remove items. It automatically resizes itself.
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al3 = new ArrayList<>();
        al.add(6);
        al.add(13);
        al.add(14);
        al.add(19);
        al.add(0, 46);
        al.add(1, 50);

        al2.add(264);
        al2.add(333);
        al2.add(183);
        al2.add(209);

        al3.add(100);
        al3.add(200);
        al3.add(300);
        al3.add(400);
        al3.add(400);

//methods
        al.addAll(al2);
        al.addAll(0, al3);
        al.remove(1);
        al.set(1, 865886969);
        System.out.println(al.clone());
        System.out.println(al.contains(264)); //returns booolean //true here
        //    al.clear();

//        for(int element : al){
//            System.out.println(element);
//        }
        //   System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("Index of 13 is : " + al.indexOf(13));
    }
}
