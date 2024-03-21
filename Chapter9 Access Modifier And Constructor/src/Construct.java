//Constructor is used to create the instance of the class.
// Constructors are almost similar to methods except for two things -
// 1. its name is the same as the class name and
// 2. it has no return type.
// Sometimes constructors are also referred to as special methods to initialize an object.




class Constructor {  //CLASS
 private int id;                   //I don't know much about access specifier till now
  private String name;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }


    //YOU CAN USE LEFT ALT + INSERT TO CREATE SETTERS AND GETTERS ALSO, CONSTRUCTORS // TRY IT PRESS LEFT ALTER + INSERT
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }



    //CONSTRUCTOR IS USED TO INITIALISE OBJECT
    public Constructor(){        //Non PARAMETERISED Constructor
        this.name = "valen";
        this.id = 46;
    }
    public  Constructor(int id, String naam) {    //PARAMETERISED CONSTRUCTOR    //Constructor OVERLOADING
        this.name = naam;
        this.id = id;
       // return name;                 //constructor does not return any value.
                                      // While declaring a constructor you will not have anything like return type.
                                     // In general, Constructor is implicitly called at the time of instantiation.
                                    // And it is not a method, its sole purpose is to initialize the instance variables.

    }
}

public class Construct {      //class

    public static void main(String[] args) {  //main function

//        WITHOUT USING OBJECT CONSTRUCTOR

//        Constructor student = new Constructor();
//        student.id = 1;
//        student.setName("valen rajubhai patel");





//        USING NON PARAMETERIZED CONSTRUCTOR

//        Constructor student = new Constructor();
//        System.out.println(student.getId());         //        System.out.print(student.getId()+" ");
//        System.out.println(student.getName());
//





        //USING PARAMETERIZED CONSTRUCTOR
        Constructor student = new Constructor(5, "valen");   // new keyword is responsible for creating object

        System.out.println(student.getId());         //        System.out.print(student.getId()+" ");
        System.out.println(student.getName());

    }
}
