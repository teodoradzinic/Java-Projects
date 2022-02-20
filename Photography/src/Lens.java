public class Lens {
    private double maxFocalLength, minFocalLength;
    private static int count;


    public Lens(double maxFocalLength, double minFocalLength) {
        if (isRight(maxFocalLength, minFocalLength)) {
            this.maxFocalLength = maxFocalLength;
            this.minFocalLength = minFocalLength;
            count++;
        } else
            throw new IllegalArgumentException("Max Focal Length cannot be less than Min Focal Length");
    }

    public static int lensCount() {
        System.out.println("Lens count: " + count);
        return count;
    }

    public void printLensData() {
        if (isRight(maxFocalLength, minFocalLength)) {
            System.out.println("LENS DATA");
            System.out.println("Focal length: " + minFocalLength + "mm - " + maxFocalLength + "mm");
        } else
            throw new IllegalArgumentException("Max Focal Length cannot be less than Min Focal Length");
    }

    public boolean isRight(double maxFocalLength, double minFocalLength) {
        if (maxFocalLength > minFocalLength)
            return true;
        else
            return false;
    }
    @Override
    public String toString(){
        return maxFocalLength + " " + minFocalLength;
    }

    public double getMaxFocalLength() {
        return maxFocalLength;
    }

    public double getMinFocalLength() {
        return minFocalLength;
    }

    public void setMaxFocalLength(double maxFocalLength) {
        if (isRight(maxFocalLength, minFocalLength)) {
            this.maxFocalLength = maxFocalLength;
        }else
            throw new IllegalArgumentException("Max Focal Length cannot be less than Min Focal Length");
    }

    public void setMinFocalLength(double minFocalLength) {
        if (isRight(maxFocalLength, minFocalLength)) {
            this.minFocalLength = minFocalLength;
        }else
            throw new IllegalArgumentException("Max Focal Length cannot be less than Min Focal Length");
    }
}

