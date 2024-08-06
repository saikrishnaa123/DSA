import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstAndLastNums {
    private static final AtomicInteger sharedCounter = new AtomicInteger(0);
    public static void main(String[] args) {
        int arr[] = {5,7,7,7,8,8,10};
        Set<String> setWithDuplicates = new LinkedHashSet<>();
        Set<String> setWithSorted = new TreeSet<>();

        // Add elements to the set
        setWithDuplicates.add("apple");
        setWithDuplicates.add("banana");
        setWithDuplicates.add("apple"); // Adding a duplicate element

        // Add elements to the set
        setWithSorted.add("banana");
        setWithSorted.add("apple");
        setWithSorted.add("apple"); // Adding a duplicate element

        // Display elements in the order they were added
        System.out.println("Set with duplicates: " + setWithDuplicates);
String s = "SaiKrishna";
Map<Character, Long> map = s.chars().mapToObj(a -> (char) a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((character, count) ->
                System.out.println("'" + character + "': " + count));
        // Display elements in the order they were added
        System.out.println("Set with sorted: " + setWithSorted);


        List<Integer> list = Arrays.asList(6,4,8,9,10,10);
        Optional<Integer> optional = Optional.ofNullable(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null));

        optional.ifPresent(System.out::println);

        List<String> list2 = Arrays.asList("apple","banana","elephant","cat","bail","dog", "zebra");
        Optional<String> optionall = Optional.ofNullable(list2.stream().distinct().sorted().collect(Collectors.toList()).toString());

        optionall.ifPresent(System.out::println);
        List<String> strings = Arrays.asList("kiwi", "apple","orange", "banana", "grape");

        List<String> sortedStrings = strings.stream()
                .sorted((s1, s2) -> {
                    if (s1.length() == s2.length()) {
                        return  s1.compareTo(s2);
                    }
                    return Integer.compare(s1.length(), s2.length());
                })
                .collect(Collectors.toList());

        System.out.println("Original List: " + strings);
        System.out.println("Sorted List by Length and Alphabetically: " + sortedStrings);

        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.getAndIncrement();
            }
        };

        // Create two threads that increment the sharedCounter
        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After both threads finish, the expected value of sharedCounter should be 20000
        System.out.println("Final value of sharedCounter: " + sharedCounter);
    }

    int[] firstAndLastOccurence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int first;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                end = mid -1;
                start = mid +1;
                if(target != arr[end]){
                    end = end -1;
                } else {
                    first = end;
                }

               /* if(target !=  ){

                }*/
            }
        }

        return null;
    }
}
