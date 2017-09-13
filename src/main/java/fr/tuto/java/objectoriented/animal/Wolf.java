package fr.tuto.java.objectoriented.animal;

public class Wolf extends Canine {

    public Wolf() {
    }

    public Wolf(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    void cry() {
        System.out.println("I howl at the moon doing ouhouh");
    }

}
