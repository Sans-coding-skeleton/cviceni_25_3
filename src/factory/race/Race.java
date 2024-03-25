package factory.race;

public class Race {
    protected int strength;
    protected int intelligence;
   protected int agility;
   protected int toughness;

    public Race(int strength, int intelligence, int agility, int toughness) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.toughness = toughness;
    }

    public static Race createPlayer(int playerClass) {
        switch (playerClass) {
            case 1:
                return new Human(3, 3, 4, 0);
            case 2:
                return new Elf(0,6,4,0);
            case 3:
                return new Dwarf(7,0,0,3);
            case 4:
                return new Troll(10,0,0,0);
            case 5:
                return new DarkElf(0,4,6,0);
            case 6:
                return new Undead(0,10,0,0);
            default:
                return null;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }
}
