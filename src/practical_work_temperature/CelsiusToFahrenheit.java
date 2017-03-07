package practical_work_temperature;

import java.util.Scanner;

/**
 * Created by camille.bernard on 01/03/2017.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        char answer = 'Y';
        int conversionModel;
        double temperature;
        double convertedTemperature;

        Scanner sc = new Scanner(System.in);


        do {
            do {
                System.out.println("Choose the model of conversion :");
                System.out.println("1 - Convert Celsius to Fahrenheit");
                System.out.println("2 - Convert Fahrenheit to Celsius");
                conversionModel = sc.nextInt();
                sc.nextLine();

                if(conversionModel != 1 && conversionModel != 2){
                    System.out.println("The model you specified is unknown. Please try again.");
                }
            } while (conversionModel != 1 && conversionModel != 2);

            System.out.println("What temperature would you like to convert ? (Y/N)");
            temperature = sc.nextDouble();
            sc.nextLine();
            if(conversionModel == 1){
                convertedTemperature = (9.0/5.0)* temperature + 32;
                System.out.println(temperature + "°C equals : " + round(convertedTemperature,2) + "°F");
            } else {
                convertedTemperature = (temperature - 32)*5.0/9.0;
                System.out.println(temperature + "°F equals : " + round(convertedTemperature,2) + "°C");
            }

            do {
                System.out.println("Would you like to convert an other temperature ?");
                answer = sc.nextLine().charAt(0);
            }while (answer != 'Y' && answer != 'N');

        } while (answer == 'Y');

        System.out.println("Goodbye !");


    }

    public static double round(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

}
