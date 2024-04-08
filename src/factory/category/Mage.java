package factory.category;

import factory.race.Race;

public class Mage extends Character{

    public Mage(String name, int strength, int agility, int intelligence, Race race) {
        super(name, strength, agility, intelligence, race);
    }

    @Override
    public double getAttack() {
        return 3*getIntelligence();
    }

    @Override
    public double getTraitToDefend(Character defender) {
        return defender.getIntelligence();
    }
}

