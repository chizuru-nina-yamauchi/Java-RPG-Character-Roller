import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Creator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the character generator!");
        System.out.println("Enter your user name: ");
        String userName = scanner.nextLine();


        String [] characterTypes = {"Warrior", "Wizard", "Potato"};
        String character = characterTypes[random.nextInt(characterTypes.length)];


        int Strength = random.nextInt(11) + 2;
        int Magic = random.nextInt(11) + 2;
        int  Health= random.nextInt(11) + 2;

        if (character.equals("Warrior")){

            System.out.println(userName + " is .... a " + character + "!");
            System.out.println();
            System.out.println("Strength: " + Strength*3);
            System.out.println("Magic: " + Magic);

            System.out.println("Health: " + Health);

        } else if (character.equals("Wizard")) {
            System.out.println(userName + " is .... a " + character + "!");
            System.out.println();
            System.out.println("Strength: " + Strength);
            System.out.println("Magic: " + Magic*3);
            System.out.println("Health: " + Health);
        } else {
            System.out.println(userName + " is .... a " + character + "!");
            System.out.println();
            System.out.println("Strength: " + Strength);
            System.out.println("Magic: " + Magic);
            System.out.println("Health: " + Health*3);
        }
        System.out.println();
        System.out.println("Happy adventuring!");


    }


}
