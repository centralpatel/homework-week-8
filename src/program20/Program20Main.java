package program20;

public class Program20Main {
    public static void main(String[] args) {

        Program20Rectangle rectangle = new Program20Rectangle(5, 10);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());
        Program20Cuboid cuboid = new Program20Cuboid(5, 10, 5);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.area = " + cuboid.getArea());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());
    }
}