package program20;

public class Program20Cuboid extends Program20Rectangle {
    double height;

    public Program20Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * height);
    }
}
