package com.aniket.java.solid;

/**
 * O - Open Closed principle
 */

interface ValueComparator {
    /**
     * @return +ve if value1 > value2, -ve if value1 < value2, 0 if value1 = value2
     */
    int compare(int value1, int value2);
}

class AscComparator implements ValueComparator {
    @Override
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}

class DscComparator implements ValueComparator {
    @Override
    public int compare(int value1, int value2) {
        return value2 - value1;
    }
}

class ArrayUtil {
    //Selection Sort
    public static final void sort(int a[], ValueComparator valueComparator) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (valueComparator.compare(a[i], a[j]) > 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

public class SolidEx2 {
    public static void main(String[] args) {
        int arr[] = {5, 6, 9, 1, 7, 2};
        ArrayUtil.sort(arr, new DscComparator());
        System.out.println("values in the array are : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
