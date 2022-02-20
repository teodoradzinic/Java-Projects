import java.util.HashSet;
import java.util.Iterator;

public class SumOfTwo {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        int v = 0;
    }

    public static boolean sumOfTwo(HashSet<Integer> a, HashSet<Integer> b, int v) {

        int rest = 0;
        Iterator i = a.iterator();

        while (i.hasNext()) {
            int value = (int) i.next();
            rest = v - value;

            if (b.contains(rest)) {
                System.out.println("Pair has been found! " + value + " + " + rest + " = " + v);
                return true;
            }
        }
        System.out.println("No pairs!");
        return false;
    }
}
