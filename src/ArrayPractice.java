import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numbers = new int [5];
        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]

        for (int i = 0, j = 10; i < numbers.length; i++, j += 5) {
            numbers[i] = j;
        }
        System.out.println(Arrays.toString(numbers)); // [10, 15, 20, 25, 30]

        System.out.println("----------------------------------------");

        int[] nums = {10, 20, 30, 40, 50}; // new int[5]

        System.out.println(java.util.Arrays.toString(nums));

        System.out.println("----------------------------------------");

        char[] characters = new char[26];

        for (int i = 0, j = 'A'; i < characters.length; i++, j++) {
            characters[i] = (char)j;
        }
        System.out.println(Arrays.toString(characters));

        System.out.println("------------------------------------------");

        for (int i = characters.length-1; i >= 0 ; i--) {
            System.out.println(characters[i]);
        }

        System.out.println("------------------------------------------");

        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4};

        // remove duplicates
        int [] resultArray = Arrays.stream(arr).distinct().toArray();
        System.out.println("resultArray = " + Arrays.toString(resultArray)); //[1, 2, 3, 4]
        // Create stream instance from a stream source
        // Arrays.stream (arr) => Stream instance created from Array

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4));
        List<Integer> resultList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("resultList = " + resultList);
        // list.stream () => Stream instance created from Collection


        // distinct() => Stream intermadiate operation => filter(), map()... has many intermadiate operations
        // toArray or collect() => Stream terminal operation

        // By using functional programming ( stream() ) => we avoid, reduce using loops

        System.out.println("------------------------------------------");

        int[] n = {10, 20, 30, 40, 50};

        for(int each : n){  // For Each Loop => Only used for data structures, no index, iteration order and number of iteration is fixed
            System.out.println(each);

        }
    }
}
