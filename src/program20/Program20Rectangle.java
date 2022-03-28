package program20;

public class Program20Rectangle {
    double width;
    double length;

    public Program20Rectangle(double width, double length) {
        if ((width < 0) && (length < 0)) {
            this.width = 0;
            this.length = 0;
        } else if ((width < 0) && (length > 0)) {
            this.width = 0;
            this.length = length;
        } else if ((width > 0) && (length < 0)) {
            this.width = width;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (width * length);
    }
}
