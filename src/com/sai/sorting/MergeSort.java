package com.sai.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,7,1,2,5};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] nums){
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length/2;
        int[] first  = mergeSort(Arrays.copyOfRange(nums, 0,mid));
        int[] second  = mergeSort(Arrays.copyOfRange(nums, mid,nums.length));

        return merge(first, second);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
             if(first[i] < second[j]){
                 mix[k] = first[i];
                 i++;

             } else {
                 mix[k] = second[j];
                 j++;
             }
            k++;

        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        Collections.sort(new ArrayList<Integer>());

        return mix;
    }

   /* String smallSubSet(String s, String p){
        Map<Character, Long> charCount = s.chars().mapToObj((char) c).collect(Collectors.groupingBy(Function.Identity(),Characters.counting()));
        p.chars().mapToObj((char) c).
                forEach(
                        c ->
                                charCount.merge(c,
                                        -1L,Long::sum)));

        return charCount.entrySet().stream()
                .flatMap(entry -> entry.getValue() > 0
                        ? entry.getKey().toString())
                        .repeat(Math.toIntExtact(entry.getValue()))
                        .chars().mapTOObj(c -> (char) c):null).collect(StringBuilder::new,StringBuilder::append
                        ,StringBuilder::append).toString();
    }*/

   // Collections.sor

   // Collections.S(new ArrayList<Integer>());

   /* public static String findSmallestSubset(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Set<Character> uniqueCharacters = new HashSet<>();
        Map<Character, Integer> lastOccurrences = new HashMap<>();

        // Iterate through the string from right to left to find the last occurrence of each character
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);

            // If the character is not already in the uniqueCharacters set, update the last occurrence
            if (!uniqueCharacters.contains(currentChar)) {
                uniqueCharacters.add(currentChar);
                lastOccurrences.put(currentChar, i);
            }
        }

        // Sort the unique characters based on their last occurrences
        uniqueCharacters.stream()
                .sorted((c1, c2) -> Integer.compare(lastOccurrences.get(c1), lastOccurrences.get(c2)))
                .forEachOrdered(System.out::println);

        // Build the smallest subset string
        StringBuilder smallestSubset = new StringBuilder();
        for (char currentChar : uniqueCharacters) {
            smallestSubset.append(currentChar);
        }

        return smallestSubset.toString();
    }*/

    /*public static void main(String[] args) {
        String input = "abacabad";
        String smallestSubset = findSmallestSubset(input);
        System.out.println("Smallest Subset: " + smallestSubset);
    }*/

}
