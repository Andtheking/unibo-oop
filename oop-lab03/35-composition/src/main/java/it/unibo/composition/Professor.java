package it.unibo.composition;

public class Professor implements User {
    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    public Professor(int id, String name, String surname, String password, String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public String getUsername() {
        return name + "." + surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return "";
    }

    public void replaceCourse(String course, int index) {
        this.courses[index] = course;
    }

    public void replaceAllCourses(String[] courses) {
        this.courses = courses;
    }


}

