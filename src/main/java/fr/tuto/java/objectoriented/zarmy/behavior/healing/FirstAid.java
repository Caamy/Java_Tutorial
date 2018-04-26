package fr.tuto.java.objectoriented.zarmy.behavior.healing;

public class FirstAid implements IHealing{

    @Override
    public void heal() {
        System.out.println("I heal wounds.");
    }
}
