package factory.category;

import factory.race.Race;

public class Warrior extends Character {

    public Warrior(String name, int strength, int agility, int intelligence, Race race) {
        super(name, strength, agility, intelligence, race);
    }

    @Override
    public double getAttack() {
        return 3*getStrength();
    }

    @Override
    public double getTraitToDefend(Character defender) {
        return defender.getStrength() ;
    }
}