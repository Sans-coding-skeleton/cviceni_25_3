package factory.race;

public class Race {
    protected double strength;
    protected double intelligence;
    protected double agility;
    protected double toughness;

    public Race(double strength, double intelligence, double agility, double toughness) {
        setStrength(strength);
        setIntelligence(intelligence);
        setAgility(agility);
        setToughness(toughness);
    }

    public static Race createPlayer(int playerClass) {
        switch (playerClass) {
            case 1:
                return new Human(1.03, 1.03, 1.04, 1.00);
            case 2:
                return new Elf(1.00, 1.06, 1.04, 1.00);
            case 3:
                return new Dwarf(1.07, 1.00, 1.00, 1.03);
            case 4:
                return new Troll(1.10, 1.00, 1.00, 1.00);
            case 5:
                return new DarkElf(1.00, 1.04, 1.06, 1.00);
            case 6:
                return new Undead(1.00, 1.10, 1.00, 1.00);
            default:
                return null;
        }
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public double getToughness() {
        return toughness;
    }

    public void setToughness(double toughness) {
        this.toughness = toughness;
    }
}
