package fr.tuto.java.objectoriented.zarmy.behavior.healing;

public class NoHealing implements IHealing {
    @Override
    public void heal() {
        System.out.println("I do NOT heal !");
    }
}
