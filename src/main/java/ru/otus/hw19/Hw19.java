package ru.otus.hw19;

import java.util.ArrayList;
import java.util.List;

public class Hw19 {
    private static List<Thread> mThreadList;
    public static void main(String[] args) throws InterruptedException {
        long t = System.currentTimeMillis();
        double[] array = new double[100_000_00];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println(System.currentTimeMillis() - t);

        long ts = System.currentTimeMillis();

        mThreadList = new ArrayList<Thread>();
        for (int i = 0; i < 4; i++) {
            int inc = i;
            mThreadList.add(new Thread("Thread #" + i) {
                @Override
                public void run() {
                    for (int i = (array.length / 4) * (inc); i < (array.length / 4) * (inc + 1); i++) {
                        array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                    }
                }
            });
        }

        for (Thread currentThread : mThreadList) {
            currentThread.start();
        }
        for (Thread currentThread : mThreadList) {
            currentThread.join();
        }

        System.out.println(System.currentTimeMillis() - ts);
    }
}
