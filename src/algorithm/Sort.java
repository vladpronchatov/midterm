package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for(int i=1; i < list.length; i++) {
            int n = list[i];
            int j = i-1;
            while(j >= 0 && list[j] > n) {
                list[j + 1] = list[j];
                j = j -1;
            }
            list[j + 1] = n;
        }
        //implement here
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        int n = list.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list[j-1] > list[j]) {
                    temp = list[j];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        } return list;
    }
    

    public int[] mergeSort(int [] array) {
        int[] list = array;
        if(list == null) {
            return null;
        }
        if(list.length > 1) {
            int mid = list.length / 2;
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++) {
                left[i]=list[i];
            }
            int[] right = new int[list.length - mid];
            for(int i = mid; i < list.length; i++) {
                right[i - mid] = list[i];
            }
            mergeSort(left);
            mergeSort(right);
            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.length && j < right.length) {
                if(left[i] < right[j]) {
                    list[k] = left[i];
                    i++;
                } else {
                    list[k] = right[j];
                    j++;
                }
                k++;
            }
            while(i< left.length) {
                list[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length) {
                list[k] = right[j];
                j++;
                k++;
            }
        }
        return list;
    }



    static int partition(int [] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j <= high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
    public int [] quickSort(int [] array){
        int [] list = array;
        int n = list.length;
        int h = n - 1;
        int l = 0;
        int[] stack = new int[h - l + 1];
        int top = -1;

        stack[++top] = l;
        stack[++top] = h;

        while(top >= 0) {
            h = stack[top--];
            l = stack[top--];

            int p = partition(list, l, h);

            if(p-1 > 1) {
                stack[++top]=l;
                stack[++top]=p-1;

            }
            if(p+1 < h) {
                stack[++top]=p+1;
                stack[++top]=h;
            }
        }
        return list;
    }


    static void buildMaxHeap(int [] array) {
        int n = array.length;
        for(int i = 1; i < n; i++) {
            if(array[i] > array[(i-1)/2]) {
                int j = i;

                while(array[j] > array[(j-1)/2]) {
                    int temp = array[j];
                    array[j] = array[(j-1)/2];
                    array[(j-1)/2] = temp;
                    j = (j-1)/2;
                }
            }
        }
    }

    public static int [] heapSort(int[] array){
        int [] list = array;

        buildMaxHeap(list);
        int n = list.length;
        int temp;

        for(int i = n -1; i > 0; i--) {
            temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            int j = 0, index;

            do{
                index = (2 * j + 1);
                if(index < (i-1) && list[index] < list[index + 1])
                    index++;

                if(index < i && list[j] < list[index]) {
                    temp = list[j];
                    list[j] = list[index];
                    list[index] = temp;
                }
                j = index;
            } while(index < i);
        }
        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;

        ArrayList<Integer>[] bucket = new ArrayList[list.length];

        for(int i = 0; i < list.length; i++)
            bucket[i] = new ArrayList<Integer>();

        for(int i =0; i < list.length; i++) {
            int bucketIndex = (int) list[i] * list.length;
            bucket[bucketIndex].add((int) list[i]);
        }
        for(int i = 0; i < list.length; i++) {
            Collections.sort((bucket[i]));
        }
        int index = 0;
        for(int i = 0; i < list.length; i++) {
            for(int j =0, size=bucket[i].size(); j < size; j++) {
                list[index++] = bucket[i].get(j);
            }
        }
        return list;
    }
    
    public int [] shellSort(int [] array) {
        int[] list = array;
        for (int interval = array.length/ 2; interval > 0; interval /= 2) {
            for (int i = interval; i < array.length ; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,3,19,23,7,15};
        int n = arr.length;

        System.out.print("Given array: ");
        printSortedArray(arr);

        heapSort(arr);

        System.out.print("Sorted array: ");
        printSortedArray(arr);
    }
}
