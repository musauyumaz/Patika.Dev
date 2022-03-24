package BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("A",30,120,100,85);
        Fighter fighter2 = new Fighter("B",30,120,100,85);

        Match match = new Match(fighter1,fighter2,85,100);
        match.run();
    }
}
