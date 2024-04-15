
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrayVsLink {


    public static Random rand = new Random();

    // EXAMPLE
    public static final double NANO_IN_MILLI = 1_000_000.0;

    public static void time() {
        long startTime = System.nanoTime();
        // call function here
        long endTime = System.nanoTime();
        double time_in_ms = (endTime - startTime) / NANO_IN_MILLI;
    }

    public static ArrayList<Integer> getArrayList(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(rand.nextInt());
        }
        return a;
    }

    public static void addAtFront(List list, int times) {
        for(int i = 0; i < times; i++) {
            list.add(0, 0);
        }
    }



    public static void main(String[] args) {

    }
}