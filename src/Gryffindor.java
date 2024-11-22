public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int witchcraftPower, int distanceOfTransgrechion, int nobility, int honor, int bravery) {
        super(name, witchcraftPower, distanceOfTransgrechion);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int sumOfMarks() {
        return getHonor() + getBravery() + getNobility();
    }

    public void comparisonGryphindors(Gryffindor student2) {
        if (sumOfMarks() > student2.sumOfMarks()) {
            System.out.println(getName() + " лучший Грифиндорец, чем " + student2.getName());
        } else if (sumOfMarks() < student2.sumOfMarks()) {
            System.out.println(student2.getName() + " лучший Грифиндорец, чем " + getName());
        }
        else{
            System.out.println(student2.getName() + " и " + getName() + " равносильные Грифиндорцы");
        }
    }

    @Override
    public String toString() {
        return getName() + " имеет: " +
                "Сила магии = " + getWitchcraftPower() + ", " +
                "Расстояние трансгрессии = " + getDistanceOfTransgrechion() + ", " +
                "Благородство = " + nobility + ", " +
                "Честь = " + honor + ", " +
                "Храбрость = " + bravery;
    }


}

