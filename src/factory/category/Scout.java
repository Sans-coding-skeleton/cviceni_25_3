package factory.category;

import factory.race.Race;

public class Scout extends Character{

    public Scout(String name, int strength, int agility, int intelligence, Race race) {
        super(name, strength, agility, intelligence, race);
    }

    @Override
    public double getAttack() {
        return 3*getAgility();
    }

    @Override
    public double getTraitToDefend(Character defender) {
        return defender.getAgility();
    }
}
