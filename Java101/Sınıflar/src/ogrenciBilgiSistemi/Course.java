package ogrenciBilgiSistemi;

public class Course {
    String name;
    String code;
    String prefix;
    int examNote;
    int quiz;
    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.quiz =0;
    }

    void addTeacher(Teacher teacher) {
        if (!this.prefix.equals(teacher.branch))
        {
            System.out.println(teacher.name +" Akademisyeni Bu Dersi veremez" );
        }else
        {
            System.out.println("İşlem Başarılı ! "+this.name +" Adlı dersi "+teacher.name +" isimli akademisyen verecektir");
        }
    }

    void printTeacher() {
        if (this.teacher !=null){
            System.out.println(this.name + " dersinin Akademisyeni : " + this.teacher.name);
        }else
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
    }
}
