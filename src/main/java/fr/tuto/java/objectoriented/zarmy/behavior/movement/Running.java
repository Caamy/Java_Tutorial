package fr.tuto.java.objectoriented.zarmy.behavior.movement;

public class Running implements IMovement {

    @Override
    public void move() {
        System.out.println("I run straight in.");
    }
}
