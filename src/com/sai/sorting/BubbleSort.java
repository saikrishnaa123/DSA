package com.sai.sorting;

import java.util.Arrays;

public class BubbleSort {
    private int counter = 0;

    // Synchronized instance method
    public synchronized void incrementCounter() {
        counter++;
        System.out.println("t1 " + getCounter());
    }

    // Non-synchronized method with a synchronized block
    public void decrementCounter() {
        synchronized(this) {
            counter--;
            System.out.println("t2 " + getCounter());
        }
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        /*int[] arr = {6,5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));*/



            BubbleSort example = new BubbleSort();

            // Create multiple threads to demonstrate synchronization
            Runnable task1 = () -> {
                for (int i = 0; i < 10; i++) {
                    example.incrementCounter();

                }
            };

            Runnable task2 = () -> {
                for (int i = 0; i < 10; i++) {
                    example.decrementCounter();
                }
            };

            Thread thread1 = new Thread(task1);
            Thread thread2 = new Thread(task2);

            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Final counter value: " + example.getCounter());
        }


  /*  static void bubble(int[] arr) {
  // run the steps for n-1 times
        boolean swapped;

        for(int i = 0 ; i < arr.length; i++){
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j ++){
                   if(arr[j] < arr[j -1]){
                       //swap
                      *//* int temp = arr[j-1];
                       arr[j-1] = arr[j];
                       arr[j] = temp;*//*
                       int temp = arr[j];
                       arr[j] = arr[j-1];
                       arr[j-1] = temp;
                       swapped = true;
                   }
            }
           //if you did not swap for a particular value of i, it means that array is sorted and hence stop the program.
            if(!swapped){
                break;
            }

        }
    }*/

    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }


    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = maxIndex(arr, 0, last);
            swap(arr, max, last);
          //  int max = maxIndex(arr, i);
           // int correct = arr[max] - 1;
          //  int temp = arr[correct];
          //  arr[correct] = arr[max];
          //  arr[max] = temp;
        }

        return arr;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        /*for (int j = 1; j < arr.length - i; j++) {
            if (arr[j] > arr[max]) {
                 max = j;
            }
        }*/

        for (int j = start; j <= end; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }

        return max;
    }


    static int[] insertionSort(int[] arr) {
        for(int i = 0; i <= arr.length - 2; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return arr;
    }



}
