package fr.tuto.java.objectoriented.zarmy.profession;

import fr.tuto.java.objectoriented.zarmy.behavior.fighting.IFightingSpirit;
import fr.tuto.java.objectoriented.zarmy.behavior.healing.IHealing;
import fr.tuto.java.objectoriented.zarmy.behavior.movement.IMovement;

public class Civilian extends Character {

    public Civilian() {
    }

    public Civilian(IFightingSpirit fightingSpirit, IHealing healing, IMovement movement) {
        super(fightingSpirit, healing, movement);
    }
}
