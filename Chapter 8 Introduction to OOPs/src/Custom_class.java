class Employees {    //class     // you can only have one public class in java file


    int id;         //attributes   // if you don't add any access modifier it becomes default type
    String name;
    int salary;

    public void print_details(){   //method
        System.out.println("my name is : "+name);
        System.out.println("my id is : "+id);
        }

    public int getSalary(){
        return salary;
    }

}

public class Custom_class {

    public static void main(String[] args) {
        //class //reference = new keyword is use to create object
        Employees valen = new Employees();   //instantiating object
        valen.id = 46;                      //setting Attributes (properties)
        valen.name = "valen";
        valen.salary = 12;


        Employees kavi = new Employees();
        kavi.id = 21346;
        kavi.name = "kavi";
        kavi.salary = 24;


//        System.out.print(valen.name);
//        System.out.println(valen.id);   OR,
        valen.print_details();             //printing attributes
        kavi.print_details();

        System.out.println(kavi.getSalary());  //or int salary = kavi.getSalary(); // sout(salary);

        int salary = valen.getSalary();
        System.out.println(salary);

    }
}
