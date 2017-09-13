package fr.tuto.java.objectoriented.animal;

public class Dog extends Canine implements Rintintin {

    public Dog() {
    }

    public Dog(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    void cry() {
        System.out.println("I bark without reason !");
    }

    public void giveHug() {
        System.out.println("I give you BIG HUGS");

    }

    public void givelicks() {
        System.out.println("I give lot of licks");

    }

    public void rollover() {
        System.out.println("I roll over like a big dog");
    }
}
