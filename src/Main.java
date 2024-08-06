import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       /* LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(65);
        linkedList.insertFirst(87);
        linkedList.insertFirst(99);
        linkedList.insertLast(100);
        linkedList.insert(50,50);
        linkedList.display();*/


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
    }
}
