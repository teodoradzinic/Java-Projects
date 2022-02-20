public class Camera {
    private String brand;
    private int megaPixels;
    private double displaySize;
    private boolean isColored;
    private Lens lens;
    private static int count;


    public Camera(String brand, int megaPixels, double displaySize, boolean isColored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.isColored = isColored;
        this.lens = lens;
        count++;
    }

    public Camera() {
        count++;
    }

    public void printCameraData(){
        System.out.println("Brand: " + brand);
        System.out.println("MegaPixels: " + megaPixels + "MP");
        System.out.println("Display Size: "+ displaySize + "inch");

        if(isColored == true)
        System.out.println("Colored pictures: yes");
        else
            System.out.println("Colored pictures: no");

        lens.printLensData();
        System.out.println();
    }

    public static int cameraCount() {
        System.out.println("Camera count: " + count);
        return count;
    }
    @Override
    public String toString(){
        return brand + " " + megaPixels + " " + displaySize + " " + isColored + " " + lens.toString();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }
}
