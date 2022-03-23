package BoxingGame;

public class Match {
    Fighter figther1;
    Fighter figther2;
    int minWeight;
    int maxWeight;


    Match(Fighter figther1, Fighter figther2, int minWeight, int maxWeight) {
        this.figther1 = figther1;
        this.figther2 = figther2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.figther1.weight > 0 && this.figther2.health > 0) {
                int randomSayi = (int) ( Math.random() * 2 + 1);
                System.out.println("==== YENİ ROUND ====");
                if (randomSayi == 1)
                {
                    this.figther2.health = figther1.hit(figther2);
                }else
                {
                    this.figther1.health = figther2.hit(figther1);
                }
                if (isWin()) {
                    break;
                }

                if (isWin()) {
                    break;
                }
                System.out.println(this.figther1.name +" Sağlık :" +this.figther1.health);
                System.out.println(this.figther2.name +" Sağlık :" +this.figther2.health);
//                System.out.println("Random değer : "+randomSayi);
            }
        } else {
            System.out.println("Sporcuların Sikletleri uyuşmuyor");
        }
    }

    boolean isCheck() {
        return (this.figther1.weight >= minWeight && this.figther1.weight <= maxWeight) && (this.figther2.weight >= minWeight && this.figther2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.figther1.health <= 0) {
            System.out.println(this.figther2.name + " kazandı!");
            return true;
        }
        if (this.figther2.health <= 0) {
            System.out.println(this.figther1.name + " kazandı!");
            return true;
        } else
            return false;
    }
}
