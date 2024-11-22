public class Hufflepuff extends hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int witchcraftPower, int distanceOfTransgrechion, int hardWork, int loyalty, int honesty) {
        super(name, witchcraftPower, distanceOfTransgrechion);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    // Getters and setters
    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int sumOfMarks() {
        return hardWork + loyalty + honesty;
    }

    public void comparisonHufflepuffs(Hufflepuff student2) {
        if (sumOfMarks() > student2.sumOfMarks()) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (sumOfMarks() < student2.sumOfMarks()) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student2.getName() + " равносильные Пуффендуйцы");
        }
    }

    @Override
    public String toString() {
        return getName() + " имеет: " +
                "Сила магии = " + getWitchcraftPower() + ", " +
                "Расстояние трансгрессии = " + getDistanceOfTransgrechion() + ", " +
                "Трудолюбие = " + hardWork + ", " +
                "Верность = " + loyalty + ", " +
                "Честность = " + honesty;
    }
}
