package fr.tuto.java.objectoriented.zarmy.profession;

import fr.tuto.java.objectoriented.zarmy.behavior.fighting.IFightingSpirit;
import fr.tuto.java.objectoriented.zarmy.behavior.fighting.Pacifist;
import fr.tuto.java.objectoriented.zarmy.behavior.healing.IHealing;
import fr.tuto.java.objectoriented.zarmy.behavior.healing.NoHealing;
import fr.tuto.java.objectoriented.zarmy.behavior.movement.IMovement;
import fr.tuto.java.objectoriented.zarmy.behavior.movement.Walking;

public abstract class Character {

    // Instances of behavior
    protected IFightingSpirit fightingSpirit = new Pacifist();
    protected IHealing healing = new NoHealing();
    protected IMovement movement = new Walking();

    public Character() {}

    public Character(IFightingSpirit fightingSpirit, IHealing healing, IMovement movement) {
        this.fightingSpirit = fightingSpirit;
        this.healing = healing;
        this.movement = movement;
    }

    public void move(){
        movement.move();
    }

    public void fight(){
        fightingSpirit.fight();
    }

    public void heal(){
        healing.heal();
    }

    public void setFightingSpirit(IFightingSpirit fightingSpirit) {
        this.fightingSpirit = fightingSpirit;
    }

    public void setHealing(IHealing healing) {
        this.healing = healing;
    }

    public void setMovement(IMovement movement) {
        this.movement = movement;
    }
}
