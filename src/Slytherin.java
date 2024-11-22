public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    // Конструктор
    public Slytherin(String name, int witchcraftPower, int distanceOfTransgrechion,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int thirstForPower) {
        super(name, witchcraftPower, distanceOfTransgrechion);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    // Getters and Setters
    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    // Метод для подсчета суммы характеристик
    public int sumOfMarks() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    // Сравнение студентов Слизерина
    public void comparisonSlytherins(Slytherin student2) {
        if (sumOfMarks() > student2.sumOfMarks()) {
            System.out.println(getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (sumOfMarks() < student2.sumOfMarks()) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student2.getName() + " равносильные Слизеринцы");
        }
    }


    @Override
    public String toString() {
        return getName() + " имеет: " +
                "Сила магии = " + getWitchcraftPower() + ", " +
                "Расстояние трансгрессии = " + getDistanceOfTransgrechion() + ", " +
                "Хитрость = " + cunning + ", " +
                "Решительность = " + determination + ", " +
                "Амбициозность = " + ambition + ", " +
                "Находчивость = " + resourcefulness + ", " +
                "Жажда власти = " + thirstForPower;
    }
}
