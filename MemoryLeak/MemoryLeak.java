
import java.io.IOException;

import java.util.*;

public class
    MemoryLeak {
    static private Random random = new Random();
    public static final ArrayList<Double> list = new ArrayList<Double>(1000000);


    static public void Leak() throws InterruptedException {
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextDouble());
        }

        System.gc();
        Thread.sleep(30000);

    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(30000);
        System.out.println("başladı");
        Leak();
        System.out.println("bitti");
    }

    }





