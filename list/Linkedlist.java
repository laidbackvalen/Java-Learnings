package list;

import java.util.LinkedList;
//When To Use
//Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
ll.add(15);
ll.add(42);
ll.add(33);
ll.add(77);
ll.add(1);
ll.addLast(12);
ll.addFirst(1);
        System.out.println("index of 42 is : "+ll.indexOf(42));


        for (int element: ll) {
            System.out.println(element);

        }
        System.out.println(ll);

        for(int i = 0; i< ll.size(); i++){
            System.out.println(ll.get(i));
        }
    }
}
