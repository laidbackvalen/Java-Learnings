
    class Monkey2 {
        void jump() {
            System.out.println("Monkey Is \"Jumping\" From Class Monkey (Parent, SuperClass)");
        }

        void bite() {
            System.out.println("Monkey Can \"Bite\"  From Class Monkey (Parent, SuperClass)");
        }

    }

    interface BasicAnimal1 {
        void eat();

        void sleep();
    }

    class Human1 extends Monkey2 implements BasicAnimal {

        @Override
        public void eat() {
            System.out.println("Implementing \"Eat\" From The (BasicAnimal Interface)");
        }

        @Override
        public void sleep() {
            System.out.println("Implementing \"Sleep\" From The (BasicAnimal Interface)");
        }
    }

    public class Q5_Polymorphism_in_monkey_Ques_3 {
        public static void main(String[] args) {
            Human1 man = new Human1();
            Monkey2 m = new Human1();

            man.jump();
            man.sleep();
            m.jump();
         //   m.sleep();  //cannot use sleep method because the reference is Monkey2 which Doesnt have sleep method

        }
    }


