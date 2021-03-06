package fr.tuto.java.objectoriented.zarmy.profession;

import fr.tuto.java.objectoriented.zarmy.behavior.fighting.IFightingSpirit;
import fr.tuto.java.objectoriented.zarmy.behavior.fighting.RiffleCombat;
import fr.tuto.java.objectoriented.zarmy.behavior.healing.IHealing;
import fr.tuto.java.objectoriented.zarmy.behavior.movement.IMovement;

public class Sniper extends Character {

    public Sniper() {
        this.fightingSpirit = new RiffleCombat();
    }

    public Sniper(IFightingSpirit fightingSpirit, IHealing healing, IMovement movement) {
        super(fightingSpirit, healing, movement);
    }
}
