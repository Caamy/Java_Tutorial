package arrays;

import java.util.Scanner;

/**
 * Created by camille.bernard on 07/03/2017.
 */
public class Arrays {

    public static void main(String[] args) {

        int integerArray[] = {0,1,2,3,4,5,6,7,8,9};
        double doubleArray[] = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        char charArray[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String stringArray[] = {"string1", "string2", "string3", "string4"};

        int integerArray2[] = new int[6];

        int firstNumbers[][] = {{0,2,4,6,8},{1,3,5,7,9}};

        System.out.println("1D array :");
        for(int i = 0; i < charArray.length; i++){
            System.out.print(charArray[i]);
        }

        System.out.println("ND array :");
        for(int i = 0; i < firstNumbers.length; i ++){
            for (int j = 0; j < firstNumbers[i].length; j ++){
                System.out.print(firstNumbers[i][j]);
            }
            System.out.println();
        }

        System.out.println("String array :");
        for(String str : stringArray){
            System.out.println(str);
        }



        char letter = ' ', answer = ' ';
        int i = 0;
        Scanner sc = new Scanner(System.in);

        do {
            do {
                i = 0;
                System.out.println("Enter a letter in low case :");
                letter = sc.nextLine().charAt(0);

                while (i < charArray.length && letter != charArray[i])
                    i++;

                if(i < charArray.length) {
                    System.out.println("The letter '" + letter + "' is in the array !");
                } else {
                    System.out.println("This letter is not on the array");
                }

            } while ( i >= charArray.length);

            do {
                System.out.println("Do you want to try again ? (Y/N)");
                answer = sc.nextLine().charAt(0);
            } while (answer !='Y' && answer != 'N');

        } while (answer == 'Y');

        System.out.println("Goodbye !");
    }

}
