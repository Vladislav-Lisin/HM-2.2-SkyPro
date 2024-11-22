public class Main {
    public static void main(String[] args) {

        // Гриффиндор
        Gryffindor Germ = new Gryffindor("Гермиона", 25, 31, 18, 10, 6);
        Gryffindor Harry = new Gryffindor("Гарри", 35, 30, 30, 20, 15);
        Gryffindor Ron = new Gryffindor("Рон", 20, 20, 20, 10, 10);
        System.out.println(Germ.toString());

        Germ.setHonor(15); // Изменяем значение
        Germ.setDistanceOfTransgrechion(32);
        System.out.println(Germ.toString());

        // Сравнение студентов Гриффиндора
        Germ.comparisonGryphindors(Harry);
        System.out.println();


        // Пуффендуй
        Hufflepuff Zacharias = new Hufflepuff("Захария", 22, 28, 15, 18, 20);
        Hufflepuff Cedric = new Hufflepuff("Седрик", 30, 35, 25, 30, 30);
        Hufflepuff Justin = new Hufflepuff("Джастин", 18, 22, 20, 20, 15);

        System.out.println(Zacharias.toString());

        // Сравнение студентов Пуффендуя
        Zacharias.comparisonHufflepuffs(Cedric);


        // Когтевран
        Ravenclaw Zhou = new Ravenclaw("Чжоу", 28, 33, 30, 32, 25, 20);
        Ravenclaw Padma = new Ravenclaw("Падма", 27, 30, 30, 29, 28, 21);
        Ravenclaw Marcus = new Ravenclaw("Маркус", 32, 40, 34, 36, 30, 35);
        System.out.println(Zhou.toString());

        // Сравнение студентов Когтеврана
        Marcus.comparisonRavenclaws(Padma);
        System.out.println();


        // Слизерин
        Slytherin Draco = new Slytherin("Драко Малфой", 40, 45, 35, 30, 32, 28, 40);
        Slytherin Graham = new Slytherin("Грэхэм Монтегю", 38, 40, 28, 34, 36, 40, 33);
        Slytherin Gregory = new Slytherin("Грегори Гойл", 36, 38, 30, 32, 35, 39, 37);
        System.out.println(Draco.toString());
        Draco.comparisonSlytherins(Graham);


        //сравнение любых учеников хогварца
        hogwarts.compareStudents(Harry, Cedric);


    }
}
