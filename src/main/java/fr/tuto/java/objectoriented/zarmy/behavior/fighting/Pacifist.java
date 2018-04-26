package fr.tuto.java.objectoriented.zarmy.behavior.fighting;

public class Pacifist implements IFightingSpirit {
    @Override
    public void fight() {
        System.out.println("I do NOT fight !");
    }
}
