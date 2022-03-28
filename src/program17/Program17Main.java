package program17;

public class Program17Main {
    public static void main(String[] args) {
        Program17Carpet carpet = new Program17Carpet(3.5);
        Program17Floor floor = new Program17Floor(2.75, 4.0);
        Program17Calculator calculator = new Program17Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());

        carpet = new Program17Carpet(1.5);
        floor = new Program17Floor(5.4, 4.5);
        calculator = new Program17Calculator(floor, carpet);

        System.out.println("Total = " + calculator.getTotalCost());
    }
}
