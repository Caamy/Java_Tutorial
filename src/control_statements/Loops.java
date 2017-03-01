package control_statements;

import java.util.Scanner;

/**
 * Created by camille.bernard on 01/03/2017.
 */
public class Loops {
    public static void main(String[] args) {
        String name;
        char answer = 'Y';

        Scanner sc = new Scanner(System.in);

        while (answer =='Y'){
            System.out.println("Enter your name :");
            name = sc.nextLine();
            System.out.println("Hello " + name + ", how are you doing ?");
            answer = ' ';

            while(answer != 'Y' && answer !='N'){
                System.out.println("Would you like to try again ? (Y/N)");
                answer = sc.nextLine().charAt(0);
            }
        }
        System.out.println("Goodbye !");

        answer = ' ';
        do {
            System.out.println("Enter your name :");
            name = sc.nextLine();
            System.out.println("Hello " + name + ", how are you doing ?");

            do {
                System.out.println("Would you like to try again ? (Y/N)");
                answer = sc.nextLine().charAt(0);
            } while (answer!= 'Y' && answer != 'N');
        } while (answer == 'Y');

        for(int i = 10; i >= 0; i--){
            System.out.println(i + " line(s) left until the end of the loop");
        }
    }
}
