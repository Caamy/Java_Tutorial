package fr.tuto.java.objectoriented.zarmy;

import fr.tuto.java.objectoriented.zarmy.behavior.healing.Surgery;
import fr.tuto.java.objectoriented.zarmy.profession.*;
import fr.tuto.java.objectoriented.zarmy.profession.Character;

public class Main {
    public static void main(String[] args) {
        Character[] tChar = {new Warrior(), new Surgeon(), new Civilian(), new Sniper(), new Doctor()};

        tChar[0].setHealing(new Surgery());

        for(Character c : tChar){
            System.out.println("\nInstance of " + c.getClass().getSimpleName());
            System.out.println("***************************************");
            c.fight();
            c.move();
            c.heal();
        }
    }
}
