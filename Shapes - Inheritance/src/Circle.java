public class Circle extends Shape {

    private int radius;

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);

        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        double roundOff = Math.round(area * 100.0) / 100.0;
        System.out.println("Area of Circle = "+roundOff + "cm²");
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        double roundOff = Math.round(perimeter * 100.0) / 100.0;
        System.out.println("Perimeter of Circle is = " + roundOff + "cm");
        return perimeter;
    }
    @Override
    public void displayData(){
        System.out.println();
        System.out.println("Color: " + getColor());
        if(getIsFilled()){
            System.out.println("IT'S FILLED!");
        }else
            System.out.println("NOT FILLED!");
        System.out.println("Radius: " + radius + "cm");
    }
}
