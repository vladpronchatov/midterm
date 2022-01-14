package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public void selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public void insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && array[j] > n) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = n;
        }
        //implement here
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public void bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }


    public void mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int n = array.length;
        int[] a = new int[n / 2];
        int[] b = new int[n - (n / 2)];
        if (n <= 1) {
            return;
        }
        System.arraycopy(array, 0, a, 0, a.length);
        System.arraycopy(array, (n / 2), b, 0, b.length);
        mergeSort(a);
        mergeSort(b);

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    private static int[] merge(int[] a, int[] b) {
        int j = 0;
        int[] c = new int[a.length + b.length];
        for (int k = 0; k <= c.length; k++) {
            c[k] = b[j++];
        }
        return c;
    }


    public void quickSort(int[] array, int start, int end) {
        final long startTime = System.currentTimeMillis();
        int partition = partition(array, start, end);

        if (partition - 1 > start) {
            quickSort(array, start, partition - 1);
        }
        if (partition + 1 < end) {
            quickSort(array, partition + 1, end);
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public static int partition(int[] list, int start, int end) {
        int pivot = list[end];

        for (int l = start; l < end; l++) {
            if (list[l] < pivot) {
                int temp = list[l];
                list[start] = list[l];
                list[l] = temp;
                start++;
            }
        }
        int temp = list[start];
        list[start] = pivot;
        list[end] = temp;
        return start;
    }


    public void heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int n = array.length;

        for (int i = n/2 - 1; i >= 0; i--)
            heapify(array, n, i);

        for(int i = n-1; i>=0; i--) {

                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                heapify(array, i, 0);
            }


        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

    }
    static void heapify(int[] array, int a, int b) {
        int large = b;
        int left = 2 * (b + 1);
        int right = 2 * (b + 2);
        if(left < a && array[left] > array[b])
            large = 1;

        if(right < a && array[right] > array[b])
            large = right;

        if(large != b) {
            int swap = array[b];
            array[b] = array[large];
            array[b] = swap;

            heapify(array, a, large);

        }

    }


    public int [] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        ArrayList<Integer>[] bucket = new ArrayList[list.length];
        for (int i = 0; i < list.length; i++)
            bucket[i] = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            int index = list[i] * list.length;
            bucket[index].add(list[i]);
        }
        for (int i = 0; i < list.length; i++) {
            Collections.sort((bucket[i]));
        }

        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                list[index++] = bucket[i].get(j);
            }
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return list;
    }


    public void shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int n = array.length;

        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval)
                    array[j] = array[j - interval];

                array[j] = temp;
            }
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
    }

    public static void printSortedArray(int[] array) {
        for (int j : array) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}

