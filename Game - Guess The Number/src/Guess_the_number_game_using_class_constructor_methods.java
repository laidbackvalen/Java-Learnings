import java.util.Random;
import java.util.Scanner;

class Games {
    private int user_number;
    private int comp_number;

    private int counter = 0;


    //Generating Random Number Using Constructor
    Random randomnumber = new Random();

    public Games() {
        int r = randomnumber.nextInt(100);
        this.comp_number = r;
    }

    //Taking User Input
    Scanner sc = new Scanner(System.in);

    public int userinput() {
        int input = sc.nextInt();
        this.user_number = input;
        return user_number;

    }
    //If Conditions
    public int isCorrect() {
        if (user_number == comp_number) {
            return 0;
        } else if (user_number > comp_number) {
            return -1;
        } else {
            return 1;
        }
    }
    //Counting Attempts
    public void setCounter() {
        counter++;
    }

    public void getCounter() {
        System.out.println("The number of guesses were " + counter);
    }
}


public class Guess_the_number_game_using_class_constructor_methods {

    public static void main(String[] args) {

        Games player = new Games();

        while (true) {
            System.out.println("Enter a number between 1 to 100 (1-100): ");
            player.userinput();

            if (player.isCorrect() == 0) {
                player.setCounter();
                System.out.println("Congratulations!! You have guessed the correct number");
                player.getCounter();
                break;
            }
            else if (player.isCorrect() == -1) {
                player.setCounter();
                System.out.println("Enter smaller number!!");
            }
            else if (player.isCorrect() == 1) {
                player.setCounter();
                System.out.println("Enter larger number!!");
            }
        }
    }
}


