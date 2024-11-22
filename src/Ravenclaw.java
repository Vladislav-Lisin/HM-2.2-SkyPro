public class Ravenclaw extends hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int witchcraftPower, int distanceOfTransgrechion, int intelligence, int wisdom, int wit, int creativity) {
        super(name, witchcraftPower, distanceOfTransgrechion);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    // Getters and setters
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int sumOfMarks() {
        return intelligence + wisdom + wit + creativity;
    }

    public void comparisonRavenclaws(Ravenclaw student2) {
        if (sumOfMarks() > student2.sumOfMarks()) {
            System.out.println(getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (sumOfMarks() < student2.sumOfMarks()) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student2.getName() + " равносильные Когтевранцы");
        }
    }

    @Override
    public String toString() {
        return getName() + " имеет: " +
                "Сила магии = " + getWitchcraftPower() + ", " +
                "Расстояние трансгрессии = " + getDistanceOfTransgrechion() + ", " +
                "Интеллект = " + intelligence + ", " +
                "Мудрость = " + wisdom + ", " +
                "Остроумие = " + wit + ", " +
                "Творчество = " + creativity;
    }
}
