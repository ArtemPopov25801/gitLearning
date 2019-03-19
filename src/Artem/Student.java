package Artem;


public class Student extends Human {

  //  Philosopher philosopher1; //

    private  String  university;
    private  int course;


    public Student () {
        this.university = "Sharaga";
        this.course = 5928;
    }

    public Student (String university , int course) {
        this.university = university;
        this.course = course;
    };




    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


}


