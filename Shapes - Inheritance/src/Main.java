public class Main {
    public static void main(String[] args) {
    Shape c = new Circle("blue", false, 15);

    c.displayData();
    c.getArea();
    c.getPerimeter();

    Shape r = new Rectangle("red", true, 10, 40);

    r.displayData();
    r.getArea();
    r.getPerimeter();

    Shape s = new Square("purple", false, 10);
    s.displayData();
    s.getArea();
    s.getPerimeter();
}
}