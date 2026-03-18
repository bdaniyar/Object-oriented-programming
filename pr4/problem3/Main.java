package problem3;

public class Main {
    public static void main(String[] args) {

        LogicGame lg = new LogicGame();
        MemoryGame mg = new MemoryGame();

        App.getStatistics(lg);
        System.out.println("-----");
        App.getStatistics(mg);

        System.out.println("-----");

        iPhone phone = new iPhone();
        phone.sell();
        phone.plugIn();
    }
}
