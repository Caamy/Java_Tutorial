package fr.tuto.java.objectoriented.zarmy.behavior.movement;

import fr.tuto.java.objectoriented.zarmy.behavior.movement.IMovement;

public class Walking implements IMovement {
    @Override
    public void move() {
        System.out.println("I walk on foot.");
    }
}
