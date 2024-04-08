package factory.category;

import factory.race.Race;

public abstract class Character implements FightingStrategy {
    protected String Name;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected Race race;
    protected int CharacterLevel;
    protected int CharacterPoints;

    public double getAttack(){
        double a = 0;
        return a;
    }
    public double getTraitToDefend(){
        double a = 0;
        return a;
    }

    public Character(String name, int strength, int agility, int intelligence, Race race) {
        Name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.race = race;
        CharacterLevel = 0;
        CharacterPoints = 0;
    }

    public static Character createPlayer(String name, int playerClass, int playerRace) {
        switch (playerClass) {
            case 1:
                return new Warrior(name,4, 1, 1, Race.createPlayer(playerRace));
            case 2:
                return new Mage(name,1, 1, 4, Race.createPlayer(playerRace));
            case 3:
                return new Scout(name,1, 4, 1, Race.createPlayer(playerRace));
            default:
                return null;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getStrength() {
        return strength * race.getStrength();
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getAgility() {
        return agility*race.getAgility();
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public double getIntelligence() {
        return intelligence * race.getIntelligence();
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public abstract double getTraitToDefend(Character defender);
}
