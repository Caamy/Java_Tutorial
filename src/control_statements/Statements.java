package control_statements;

/**
 * Created by camille.bernard on 01/03/2017.
 */
public class Statements {

    public static void main(String[] args) {
        int i = 10;

        if (i < 0){
            System.out.println("The number is negative");
        } else {
            if(i == 0){
                System.out.println("The number is neutral");
            } else {
                System.out.println("The number is positive");
            }
        }

        i = -3;
        if (i < 0) {
            System.out.println("The number is negative");
        } else if (i == 0){
            System.out.println("The number is neutral");
        } else {
            System.out.println("The number is positive");
        }

        i = 45;

        if(i < 100 && i > 30){
            System.out.println("The number is in the interval");
        } else {
            System.out.println("The number is not in the interval");
        }

        i = 10;

        switch(10){
            case 0 :
                System.out.println("You can start by learning your lesson, young padawan");
                break;
            case 10 :
                System.out.println("You understood the essentials. Try rereading it to master it.");
                break;
            case 20 :
                System.out.println("Perfect !");
                break;
            default :
                System.out.println("You should work more");
        }

        int x = 10, y = 20;
        int max = (x < y) ? y : x;
        System.out.println("The maximum is : " + max);
    }
}
