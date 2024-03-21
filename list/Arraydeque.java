package list;

import java.util.*;
//The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface.
// It is also known as Array Double Ended Queue or Array Deck.
// This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.
public class Arraydeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(5);
        ad.add(6);
        ad.add(7);
        ad.add(8);
        ad.addFirst(4);
        ad.addLast(9);
        // ad.offerFirst(1);  //similar to addFirst() method

        for (int element :
                ad) {
            System.out.println(element);
        }

    }
}
