public class Main {
    public static void main(String[] args) {


        Lens l1 = new Lens(35, 18);
        Lens l2 = new Lens(50, 35);
        Lens l3 = new Lens (100, 50);
        Lens l4 = new Lens (150, 100);
        Lens l5 = new Lens(170,150);

        l4.setMaxFocalLength(130);

        Camera c1 = new Camera("Nikon", 56, 4, true, l2);
        Camera c2 = new Camera("Canon", 80, 6, false, l4);
        Camera c3 = new Camera("Polaroid", 20, 3, false, l1);

        Camera c4 = new Camera();
        c4.setBrand("Samsung");
        c4.setMegaPixels(64);
        c4.setDisplaySize(2);
        c4.setColored(true);
        c4.setLens(l3);


        c1.printCameraData();
        c2.printCameraData();
        c3.printCameraData();
        c4.printCameraData();

        System.out.println(c3);

        l2.lensCount();
        c1.cameraCount();


    }
}
