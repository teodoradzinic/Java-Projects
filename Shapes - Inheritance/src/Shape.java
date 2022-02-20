public abstract class Shape {
   private String color;
   private boolean isFilled;

    public Shape(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void displayData();

    public String getColor() {
        return color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

}
