package ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher teacher1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher teacher2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher teacher3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        kimya.addTeacher(teacher3);

        Student student1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        student1.addBulkExamNote(50,20,40,70,90,80);
        student1.isPass();

        Student student2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        student2.addBulkExamNote(100,50,40,75,30,65);
        student2.isPass();

        Student student3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        student3.addBulkExamNote(50,20,40,90,80,100);
        student3.isPass();
    }
}
