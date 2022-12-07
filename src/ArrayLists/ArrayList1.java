package ArrayLists;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

    public static Integer[] data = {8,32,17,19,45,88,76};

    public static void main(String[] args) {

        /* Initializations */
        ArrayList arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<?> arrayList3 = new ArrayList<>();

        Collections.addAll(arrayList1, data);
        System.out.println(arrayList1);

        arrayList1.stream().forEach(System.out::println);
        arrayList1.stream().sorted().forEach(System.out::println);
        arrayList1.stream().filter(a -> a%2 ==0).forEach(System.out::println);
        int index = 2;
        arrayList1.stream().skip(index).limit(1).forEach(System.out::println);
    }
}
