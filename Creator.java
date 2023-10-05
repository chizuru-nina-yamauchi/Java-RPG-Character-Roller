import java.sql.SQLOutput;
import java.util.Random;

public class Creator {
    public static void main(String[] args) {

        String characterName = args[0];

        System.out.println("Welcome to the character generator!");

Random rng = new Random();

int n = rng.nextInt(13);



        if (characterName.equals("Fred")){
            System.out.println(characterName + " is .... a Wizard!");
            System.out.println();
            System.out.println("Strength: " + n);
            System.out.println("Magic: " + n);
            System.out.println("Health: " + n);
        } else if (characterName.equals("Nina")) {
            System.out.println(characterName + " is .... a Warrior");
        } else System.out.println(characterName + " is .... a Potato");

        System.out.println();
        System.out.println("Happy adventuring!");



    }


}
