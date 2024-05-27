package AlgorithmenUndDatenstrukturen.sortieralgorithmen;

import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args) {
        int[] a = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7, 29, 106, 723, 992, 102, 92};
        System.out.println(Arrays.toString(bucketSort(a)));
    }

    public static int[] bucketSort(int[] a) {
        int[][] buckets = new int[10][a.length+1];
        int max = getMax(a);

        for(int e : a) {
            int index = e / max;
            buckets[index][buckets[index][0] + 1] = e;
            buckets[index][0]++;
        }

        int element = 0;
        for(int i=0; i<10; i++) {
            int[] sorted = bubbleSort(Arrays.copyOfRange(buckets[i], 1, buckets[i][0]+1));
            for (int k : sorted) {
                a[element] = k;
                element++;
            }
        }

        return a;
    }

    public static int getMax(int[] a) {
        int max = a[0];
        for(int e : a) {
            if(e > max) {
                max = e;
            }
        }

        return max;
    }

    public static int[] bubbleSort(int[] a) {
        int n = a.length;

        while(n > 0) {
            for(int i=0; i<n-1; i++) {
                if(a[i] > a[i+1]) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            n--;
        }

        return a;
    }
}