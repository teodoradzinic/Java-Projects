public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        if (width > 0 && length > 0) {
            this.width = width;
            this.length = length;
        } else
            throw new IllegalArgumentException();
    }
    public Rectangle(String color, boolean isFilled){
        super(color, isFilled);
    }
    @Override
    public double getArea(){
        double area = length * width;
        System.out.println("Area = " + area +"cm²");
        return area;

    }
    @Override
    public  double getPerimeter(){
        double perimeter = 2*(length + width);
        System.out.println("Perimeter = " + perimeter +"cm");
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
        System.out.println("Width: " + width + "cm");
        System.out.println("Length: " + length + "cm");
    }
}
