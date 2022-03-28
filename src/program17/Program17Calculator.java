package program17;

public class Program17Calculator {
    Program17Floor floor;
    Program17Carpet carpet;

    public Program17Calculator(Program17Floor floor, Program17Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
