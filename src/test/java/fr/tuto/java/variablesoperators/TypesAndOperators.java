package fr.tuto.java.variablesoperators;

public class TypesAndOperators {

    public static void main(String[] args) {

        System.out.println("Primitive types :");
        //byte (1 byte) : integer from -128 to +127
        byte temperature = 64;
        System.out.println("Temperature = " + temperature);

        //short (2 bytes) : integer from -32768 to +32567
        short maxSpeed = 32000;
        System.out.println("Max speed = " + maxSpeed);

        //int (4 bytes) : -2 x 10^9 to +2 x 10^9
        int sunTemperature = 15600000;
        System.out.println("Sun temperature in Kelvin = " + sunTemperature);

        //long (8 bytes) : -9x10^18 to +9x10^18
        long lightSpeed = 9460700000000000L;
        System.out.println("Light speed = " + lightSpeed);

        // float (4 bytes)
        float pi = 3.141592653f;
        System.out.println("Pi = " + pi);

        //double (8 bytes)
        double division = 0.333333333333333333333333333333333333333333334;
        System.out.println("Division = " + division);

        // char : A character
        char character = 'A';
        System.out.println("Character = " + character);

        // boolean : true or false
        boolean question = true;
        System.out.println("Question = " + question);

        // String : string of characters
        String sentence = "Hello World!";
        System.out.println(sentence);

        System.out.println();
        System.out.println("===================================");

        System.out.println("Operators");
        int nbr1, nbr2, nbr3;

        nbr1 = 1 + 3;
        nbr2 = 2 * 6;
        nbr3 = nbr2 / nbr1;
        nbr1 = 5 % 2;
        nbr3 = nbr3 + 1;
        nbr1++;



    }
}
