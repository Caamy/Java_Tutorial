package fr.tuto.java.objectoriented.animal;

public class Cat extends Feline {

    public Cat() {
    }

    public Cat(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    void cry() {
        System.out.println("I meow on the roof");
    }
}
