class Employee {
   int salary;  //static int salary;
    String name;

    public int getSalary() {
        return this.salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String n) {   //doesn't return
        this.name=n;
    }


}

public class Q1_Prac_create_class_employees_methods {
    public static void main(String[] args) {

        Employee valen = new Employee();
        valen.salary = 12;
    //   int a = Employee.salary;  //after making salary static for a while
        System.out.println(valen.getSalary());

        valen.setName("valen");
        System.out.println(valen.getName());


    }
}
