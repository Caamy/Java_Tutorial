package fr.tuto.java.objectoriented.animal;

public class Lion extends Feline {

    public Lion() {
    }

    public Lion(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    void cry() {
        System.out.println("I roar in the savana");
    }
}
