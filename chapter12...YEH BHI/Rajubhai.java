package morarbhai.rajubhai;
class Raj{
    
    public void rajj(){
        System.out.println("my name is rajbhhai");
    }
}
public class Rajubhai {
    public static void main(String[] args) {
    
        System.out.println("I am rajubhai morarbhai patel");
        Raj r = new Raj();

    
        
    }
    
}
//javac -d . Rajubhai.java
//javac -d  abc Rajubhai.java   //THIS WILL CREATE A FOLDER "abc" THAN CREATE A PACKAGE "morarbhai" INSIDE THAT PACKAGE IT WILL CREATE ONE MORE PACKAGE "rajubhai" THAN CREATE A CLASS "Rajubhai"