public class Square extends Rectangle{
    private double side;
    public Square(String color, boolean isFilled, double side){
        super(color,  isFilled,  side,  side);
            if (side < 1 ){
                throw new IllegalArgumentException();
            }


           /* super(color, isFilled);
            if (side > 0){
                this.side = side;
            }
            else
                throw new IllegalArgumentException();*/

    }
   /* @Override
    public double getArea(){
        double area = side * side;
        System.out.println("Area of Square = " + area +"cm²");
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter = 4 * side;
        System.out.println("Perimeter of the Square = " + perimeter + "cm");
        return perimeter;
    }*/
}
