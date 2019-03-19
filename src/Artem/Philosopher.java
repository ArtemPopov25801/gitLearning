package Artem;



public class Philosopher extends Student {

    private int countBooks;

    public Philosopher() {
        this.countBooks = 2;
    }


    // Через Philosopher пытаемся всё вывести //
    public Philosopher(String name, String surename, String birthdate, String University, int course, int countBooks) {
        this.setSurename(surename);
        this.setName(name);
        this.setUniversity(University);
        this.setCourse(course);
        this.setCountBooks(countBooks);
        this.setBirthdate(Utils.parseDate(birthdate));
    }


    // Конструктор//
    public Philosopher(int countBooks) {
        this.countBooks = countBooks;
    }

    ;
    // Конструктор кончился//


    // геттер и сеттер
    public int getCountBooks() {
        return countBooks;
    }

    public void setCountBooks(int countBooks) {
        this.countBooks = countBooks;
    }
    // капец //



    // метод для вывода println  одну строку а не 6//
    @Override
    public String toString() {
       /* String philosoph = "Имя: " + this.getName()
                + "\nФамилия " + this.getSurename()
                + "\nДата рождения " + this.getBirthdate()
                + "\nНазвание университета" + this.getUniversity()
                + "\nНомер курса" + this.getCourse()
                + "\nКоличество прочитанных книг" + this.getCountBooks();
        return philosoph;
        */

        /* или заменяем */

        return "Имя: " + this.getName() + " " + "Фамилия: "  + this.getSurename(); // Это нужно для сокращения потребления памяти//

    }
}
