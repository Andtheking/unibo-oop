package it.unibo.composition;
public class Exam {
    private int id;
    private int maxStudents;
    private int registeredStudents;
    private String courseName;
    private Professor professor;
    private ExamRoom room ;
    private Student[] students;

    public Exam(int id, int maxStudents, int registeredStudents, String courseName, Professor professor, ExamRoom room) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room =  room;

        this.registeredStudents = 0;
        this.students = new Student[maxStudents];
    } 


    public int getId() {
        return this.id;
    }
    public int getMaxStudents() {
        return this.maxStudents;
    }
    public int getRegisteredStudents() {
        return this.registeredStudents;
    }
    public String getCourseName() {
        return this.courseName;
    }
    public Professor getProfessor() {
        return this.professor;
    }
    public ExamRoom getRoom()  {
        return this.room;
    }
    public Student[] getStudents() {
        return this.students;
    }

    public void registerStudent(Student student) {
        if (registeredStudents >= maxStudents) return;
        students[registeredStudents] = student;
        registeredStudents++;
    }

    public String toString() {
        return "Exam: " +
            "id=" + id +
            ", maxStudents=" + maxStudents +
            ", registeredStudents=" + registeredStudents +
            ", courseName='" + courseName + '\'' +
            ", professor=" + professor +
            ", room=" + room +
            ", students=" + java.util.Arrays.toString(students);
    }   

}
