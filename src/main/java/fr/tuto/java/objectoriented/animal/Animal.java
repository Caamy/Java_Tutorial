package fr.tuto.java.objectoriented.animal;

public abstract class Animal {

    protected int weight;
    protected String color;

    protected void eat() {
        System.out.println("I eat meat.");
    };

    protected void drink() {
        System.out.println("I drink water !");
    };

    abstract void move();

    abstract void cry();

    @Override
    public String toString() {
        String str = "I'm an object of " + this.getClass() + ", I'm " + this.color + " and i weight " + this.weight + " kg.";

        return str;
    }
}
