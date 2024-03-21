interface A {
   int add(int a, int b);


}
class B implements A {  //class to interface bhi implement hota hai

    @Override
    public int add(int a, int b) {
        return 0;
    }
}
class C extends B{

}
public class P {
}
