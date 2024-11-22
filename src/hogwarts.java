public class hogwarts {
    private String name;
    private int witchcraftPower;
    private int distanceOfTransgrechion;

    public hogwarts(String name, int witchcraftPower, int distanceOfTransgrechion){
        this.name = name;
        this.distanceOfTransgrechion = distanceOfTransgrechion;
        this.witchcraftPower = witchcraftPower;
    }

    public int getWitchcraftPower(){
        return witchcraftPower;
    }

    public int getDistanceOfTransgrechion(){
        return distanceOfTransgrechion;
    }

    public void setCharacteristic(int witchcraftPower){
        this.witchcraftPower = witchcraftPower;
    }

    public void  setDistanceOfTransgrechion(int distanceOfTransgrechion){
        this.distanceOfTransgrechion = distanceOfTransgrechion;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void compareStudents(hogwarts student1, hogwarts student2) {
        int student1Score = student1.getWitchcraftPower() + student1.getDistanceOfTransgrechion();
        int student2Score = student2.getWitchcraftPower() + student2.getDistanceOfTransgrechion();

        if (student1Score > student2Score) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии и трансгрессии, чем " + student2.getName());
        } else if (student1Score < student2Score) {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии и трансгрессии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по мощности магии и трансгрессии.");
        }
    }
}
