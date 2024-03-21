package list;


import java.util.HashSet;

//The set interface in the java.util package and extends Collection interface is an unordered collection of objects
// in which duplicate values cannot be stored. It is an interface that implements the maths set.
// This interface contains the methods inherited from the Collection interface and adds a feature that restricts to insert the
// duplicate elements.
public class Set {  //it is unordered collection
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(40);
        hs.add(60);
        hs.add(60);    //it doesn't store duplicate values
        System.out.println(hs);
    }
}
