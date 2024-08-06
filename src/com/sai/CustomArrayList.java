package com.sai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomArrayList {

    private int[] data;
    private int size;
    private static int DEFAULT_CAPACITY = 10;

    public CustomArrayList(){
        this.data = new int[DEFAULT_CAPACITY];
    }

    public void add(int e){
        if(isFull()) {
            resize();
        }
        data[size++] = e;
    }

    public void remove(int index){
        if(index < data.length){
            data[index] = 0;
        }

    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    void arrayUnion(int[] arr1, int[] arr2){

        List<Integer> arrList1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());

        List<Integer> arrList2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        List<Integer> unionList = new ArrayList<>(arrList1);

        unionList.addAll(arrList2);
        Integer[] arr = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).distinct().collect(Collectors.toList()).toArray(new Integer[0]);

        int[] unionArr = unionList.stream().distinct().mapToInt(Integer::intValue).toArray();




    }
}
