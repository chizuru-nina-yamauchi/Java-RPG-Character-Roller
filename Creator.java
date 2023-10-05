import java.sql.SQLOutput;
import java.util.Random;

public class Creator {
    public static void main(String[] args) {
        Random random = new Random();

        String [] characterTypes = {"Warrior", "Wizard", "Potato"};
        String character = characterTypes[random.nextInt(characterTypes.length)];

        System.out.println("Welcome to the character generator!");


int n = random.nextInt(11) + 2;

int Strength = random.nextInt(11) + 2;
int Magic = random.nextInt(11) + 2;
int  Health= random.nextInt(11) + 2;

        if (character.equals("Warrior")){
            System.out.println(args[0] + " is .... a " + character + "!");
            System.out.println();
            System.out.println("Strength: " + Strength*3);
            System.out.println("Magic: " + Magic);
            System.out.println("Health: " + Health);
        } else if (character.equals("Wizard")) {
            System.out.println(args[0] + " is .... a " + character + "!");
            System.out.println();
            System.out.println("Strength: " + Strength);
            System.out.println("Magic: " + Magic*3);
            System.out.println("Health: " + Health);
        } else {
            System.out.println(args[0] + " is .... a " + character + "!");
            System.out.println();
            System.out.println("Strength: " + Strength);
            System.out.println("Magic: " + Magic);
            System.out.println("Health: " + Health*3);
        }
        System.out.println();
        System.out.println("Happy adventuring!");


    }


}
