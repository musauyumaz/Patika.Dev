package ogrenciBilgiSistemi;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course course1;
    Course course2;
    Course course3;
    float avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course course1, Course course2, Course course3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    void addBulkExamNote(int course1Note, int course2Note, int course3Note, int course1Quiz, int course2Quiz, int course3Quiz) {
        if (course1Note >= 0 && course1Note <= 100 || course1Quiz >= 0 && course1Quiz <= 100) {
            this.course1.examNote = course1Note;
            this.course1.quiz = course1Quiz;
        }
        if (course2Note >= 0 && course2Note <= 100 || course2Quiz >= 0 && course2Quiz <= 100) {
            this.course2.examNote = course2Note;
            this.course2.quiz = course2Quiz;
        }
        if (course3Note >= 0 && course3Note <= 100 || course3Quiz >= 0 && course3Quiz <= 100) {
            this.course3.examNote = course3Note;
            this.course3.quiz = course3Quiz;
        }
    }

    void isPass() {
        if (this.course1.examNote == 0 || this.course2.examNote == 0 || this.course3.examNote == 0
                || this.course1.quiz == 0 || this.course2.quiz == 0 || this.course3.quiz == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    void calcAvarage() {
        this.avarage = (((this.course1.examNote + this.course2.examNote + this.course3.examNote) * 0.8f) / 3) +
                (((this.course1.quiz + this.course2.quiz + this.course3.quiz) * 0.2f) / 3);
    }

    void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci Adı : " + this.name);
        System.out.println(course1.name + " Sınav Notu : " + this.course1.examNote);
        System.out.println(course1.name + " Quiz Notu : " + this.course1.quiz);
        System.out.println(course2.name + " Sınav Notu : " + this.course2.quiz);
        System.out.println(course2.name + " Quiz Notu : " + this.course2.examNote);
        System.out.println(course3.name + " Sınav Notu : " + this.course3.examNote);
        System.out.println(course3.name + " Quiz Notu : " + this.course3.quiz);
    }
}
