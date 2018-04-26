package fr.tuto.java.objectoriented.zarmy.profession;

import fr.tuto.java.objectoriented.zarmy.behavior.fighting.GunFight;
import fr.tuto.java.objectoriented.zarmy.behavior.fighting.IFightingSpirit;
import fr.tuto.java.objectoriented.zarmy.behavior.healing.IHealing;
import fr.tuto.java.objectoriented.zarmy.behavior.movement.IMovement;

public class Warrior extends Character {

    public Warrior() {
        this.fightingSpirit = new GunFight();
    }

    public Warrior(IFightingSpirit fightingSpirit, IHealing healing, IMovement movement){
        super(fightingSpirit, healing, movement);
    }
}
