package fr.tuto.java.objectoriented.zarmy.profession;

import fr.tuto.java.objectoriented.zarmy.behavior.fighting.IFightingSpirit;
import fr.tuto.java.objectoriented.zarmy.behavior.healing.FirstAid;
import fr.tuto.java.objectoriented.zarmy.behavior.healing.IHealing;
import fr.tuto.java.objectoriented.zarmy.behavior.movement.IMovement;

public class Doctor extends Character {

    public Doctor() {
        this.healing = new FirstAid();
    }

    public Doctor(IFightingSpirit fightingSpirit, IHealing healing, IMovement movement) {
        super(fightingSpirit, healing, movement);
    }
}
