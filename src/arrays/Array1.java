package arrays;

import java.util.Arrays;

public class Array1 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        /* C style array declaration. Not preferred. */
        int arr2[] = {11,22,33,44,55};
        int[] arr3 = new int[3];
        int arr4[] = new int[4];
        String[] arr5 = new String[7];

        Arrays.stream(arr1).forEach(System.out::println);
        Arrays.stream(arr2).forEach(System.out::println);
        Arrays.stream(arr3).forEach(System.out::println);
        Arrays.stream(arr4).forEach(System.out::println);
        Arrays.stream(arr5).forEach(System.out::println);
    }
}
