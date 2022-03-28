package program19;

//3. Write a class with the name Main that have main method
public class Program19Main {
    public static void main(String[] args) {
        Program19Circle circle = new Program19Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());
        Program19Cylinder cylinder = new Program19Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());
    }
}
