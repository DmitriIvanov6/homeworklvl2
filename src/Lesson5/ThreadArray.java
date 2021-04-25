package Lesson5;

import java.util.Arrays;

public class ThreadArray {
    static final int size = 10000000;
    static final int h = size / 2;

    public void firstMethod() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    public void secondMethod() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        float[] firstHalfArray = new float[h];
        float[] secondHalfArray = new float[h];
        System.arraycopy(arr, 0, firstHalfArray, 0, h);
        System.arraycopy(arr, h, secondHalfArray, 0, h);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < firstHalfArray.length; i++) {
                firstHalfArray[i] = (float) (firstHalfArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < secondHalfArray.length; i++) {
                secondHalfArray[i] = (float) (secondHalfArray[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(firstHalfArray, 0, arr, 0, h);
        System.arraycopy(secondHalfArray, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }


}
