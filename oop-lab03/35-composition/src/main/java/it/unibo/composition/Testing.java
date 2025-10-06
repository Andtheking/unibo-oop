package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student s1 = new Student(1, "Mario", "Rossi", "pwd1", 2025);
        Student s2 = new Student(2, "Luigi", "Verdi", "pwd2", 2010);
        Student s3 = new Student(3, "Anna", "Bianchi", "pwd3", 2017);
        // 2)Creare 2 docenti a piacere
        Professor p1 = new Professor(1, "Alberto", "Neri", "pwd4", new String[] {"Informatica", "Programmazione"});
        Professor p2 = new Professor(2, "Giovanni", "Gialli", "pwd5", new String[] {"Analisi", "Geometria"});
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom r1 = new ExamRoom(26,"Aula Magna", true, true);
        ExamRoom r2 = new ExamRoom(100,"Aula Magna 2", true, false);
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam e1 = new Exam(1, 10, 0, "Informatica", p1, r1);
        Exam e2 = new Exam(2, 2, 0, "Analisi", p2, r2);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        e1.registerStudent(s1);
        e1.registerStudent(s2);
        e1.registerStudent(s3);
        e2.registerStudent(s1);
        e2.registerStudent(s2);
        e2.registerStudent(s3); 
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(e1);
        System.out.println(e2); 
    }
}
