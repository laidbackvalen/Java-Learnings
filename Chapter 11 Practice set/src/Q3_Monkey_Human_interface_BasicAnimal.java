class Monkey {
    void jump() {
        System.out.println("Monkey Is \"Jumping\" From Class Monkey (Parent, SuperClass)");
    }

    void bite() {
        System.out.println("Monkey Can \"Bite\"  From Class Monkey (Parent, SuperClass)");
    }

}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {

    @Override
    public void eat() {
        System.out.println("Implementing \"Eat\" From The (BasicAnimal Interface)");
    }

    @Override
    public void sleep() {
        System.out.println("Implementing \"Sleep\" From The (BasicAnimal Interface)");
    }
}

public class Q3_Monkey_Human_interface_BasicAnimal {
    public static void main(String[] args) {
        Human man = new Human();
        man.jump();
        man.sleep();
    }
}
