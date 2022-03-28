package homework8rashila;

//Java program to overload constructors
class Program25Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Program25Student5(int i, String n) {
        id = i;
        name = n;
    }

    Program25Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Program25Student5 s1 = new Program25Student5(111, "Karan");
        Program25Student5 s2 = new Program25Student5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
