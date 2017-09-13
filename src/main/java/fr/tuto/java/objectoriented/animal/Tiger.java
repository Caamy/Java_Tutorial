package fr.tuto.java.objectoriented.animal;

public class Tiger extends Feline {

    public Tiger() {
    }

    public Tiger(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    void cry() {
        System.out.println("I grumble very loudly");
    }

}
