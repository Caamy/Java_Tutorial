package keyboard_entry;

import java.util.Scanner;

/**
 * Created by camille.bernard on 28/02/2017.
 */
public class KeyboardEntry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a word and press Enter :");
        String str = sc.nextLine();
        System.out.println("You wrote : " + str);

        System.out.println("Please, enter a number :");
        int nbr = sc.nextInt();
        System.out.println("You typed : " + nbr);

        System.out.println("Please, enter a character :");
        sc.nextLine();  // Empty the line before using a new scanner.
        String character = sc.nextLine();
        System.out.println("You wrote : " + character.charAt(0));
    }
}
