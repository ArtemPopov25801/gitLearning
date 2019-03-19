package Artem;


import java.util.Date;

public  class Human {

  //  Student student1; // <--- кусочек связи ///



    private String name ;
    private String surename ;
    private Date birthdate;



    public Human () {
        name = "Super";
        surename = "Puper";
        birthdate = Utils.parseDate("12.02.1994");
     //    this.birthdate = "12.02.1994";  - не знаю как записать дату ///
    }  // <---- пустой конструктор

    public Human (String name, String surename, String birthdate) {
        this.name = name;
        this.surename = surename;
        this.birthdate = Utils.parseDate(birthdate);
    }


    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getSurename() {
        return surename;
    }



    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }



}
