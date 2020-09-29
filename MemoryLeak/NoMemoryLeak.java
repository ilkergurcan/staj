

import java.io.IOException;

import java.util.*;

public class NoMemoryLeak {
    static private Random random = new Random();
    static public void GC() throws InterruptedException {
        Listeyidoldur();
        System.gc();
        Thread.sleep(10000);
    }

    private static void Listeyidoldur(){
        ArrayList<Double> list = new ArrayList<Double>(1000000);
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextDouble());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(30000);
        System.out.println("başladı");
        GC();
        System.out.println("bitti");
    }
}
