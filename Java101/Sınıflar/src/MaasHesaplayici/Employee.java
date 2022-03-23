package MaasHesaplayici;

public class Employee {
    String name;
    float salary;
    int workHours;
    int hireYear;

    Employee(String name, float salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    float tax() {
        if (this.salary >= 1000) {
            float kesinti = this.salary * 0.03f;
            //System.out.println(this.name + " maaşınızdan " + kesinti + " ₺ kesinti yapılmıştır");
            return kesinti;
        } else if (salary <= 1000) {
            //System.out.println("Vergi kesintisi uygulanmamıştır");
            return 0;
        } else
            return 0;

    }

    float bonus() {
        float bonus = 0;
        if (this.workHours >= 40) {
            bonus = (workHours - 40) * 30;
            //this.salary += bonus;
            //System.out.println("Toplam bonus :" + bonus + " ₺");
            return bonus;
        } else {
            return bonus;
        }

    }

    float raiseSalary() {
        float zam = 0;
        int year = 2021;
        if (year - this.hireYear < 10) {
            zam = this.salary * 0.05f;
            //this.salary += zam;
            //System.out.println("Toplam Maaş Artışınız : " + zam + " ₺");
            return zam;
        } else if (year - this.hireYear >= 10 && year - this.hireYear < 20) {
            zam = this.salary * 0.1f;
            //this.salary += zam;
            //System.out.println("Toplam Maaş Artışınız : " + zam + " ₺");
            return zam;
        } else if (year - this.hireYear >= 20) {
            zam = this.salary * 0.15f;
            //this.salary += zam;
            //System.out.println("Toplam Maaş Artışınız : " + zam + " ₺");
            return zam;
        } else return zam;
    }

    public void printEmployee() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("İşe Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslarla Birlikte Maaşı: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş: " + (this.salary + bonus() + raiseSalary() - tax()));
    }
}
