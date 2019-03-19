package Artem;




public class Main {


    //static Philosopher philosopher1; // <-- при добавлении конcтруктора объявление переносится ниже//

    //^ Модуль компиляции

    public static void main(String[] args)
        /* throws Exception - исключить ошибки */ {

        //  human1.student1 = student1;  < -- связь м/ду человеком и студентом (зачем?)//

        // Date date = Utils.parseDate("11.11.1111")  //

        Human human1 = new Human("Artur", "Clark", "16.12.1917");

        Student student1 = new Student("MIT", 2);

       /* philosopher1.setCountBooks ("408");   заменяем на конструктор */

    /*  Philosopher philosopher1 = new Philosopher(408); // <- отросток малого основного конструктора))00) // */

        Philosopher philosopher1 = new Philosopher("Artur", "Clark", "16.12.1917", "MIT", 2, 408); // <- отросток контруктора))00)///


        // Тупые выводы с новой строки //
        System.out.println("Имя:" + " " + human1.getName());
        System.out.println("Фамилия:" + " " + human1.getSurename());
        System.out.println("Дата рождения:" + " " + human1.getBirthdate());
        System.out.println("Название университета:" + " " + student1.getUniversity());
        System.out.println("Номер курса:" + " " + student1.getCourse());
        System.out.println("Количество прочитанных книг:" + " " + philosopher1.getCountBooks());

        System.out.println("Имя:" + " " + philosopher1.getName());
        System.out.println("Фамилия:" + " " + philosopher1.getSurename());
        System.out.println("Дата рождения:" + " " + philosopher1.getBirthdate());
        System.out.println("Название университета:" + " " + philosopher1.getUniversity());
        System.out.println("Номер курса:" + " " + philosopher1.getCourse());
        System.out.println("Количество прочитанных книг:" + " " + philosopher1.getCountBooks());

        Human human2 = new Human();
        System.out.println("Имя:" + " " + human2.getName());


        System.out.println(philosopher1);

    }
}