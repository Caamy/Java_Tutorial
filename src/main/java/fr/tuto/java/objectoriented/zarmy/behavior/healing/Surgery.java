package fr.tuto.java.objectoriented.zarmy.behavior.healing;

public class Surgery implements IHealing {
    @Override
    public void heal() {
        System.out.println("I do surgeries.");
    }
}
