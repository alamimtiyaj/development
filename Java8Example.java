package com.AmericanAir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Example {

    public static void main(String[] args) {

        String[] s = { "Apple", "mango", "pineapple", "lichi", "Apple" };
        int[] arr = { 5, 2, 3, 6, 9, 7, 5, 2, 3, 5, 10 };
        List<Integer> dupl = new ArrayList<>();

        List<String> al = Arrays.asList(s);

        Optional<String> fruit = al.stream().filter(a -> a.equals("Apple")).findAny();

        System.out.println(fruit);

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {

        //             dupl.add(arr[j]);

        //         }
        //     }
        // }

        // System.out.println(dupl);

        Map<Integer, Long> dupList= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        for(Map.Entry<Integer,Long> m : dupList.entrySet())
        {
            if(m.getValue()>1)
            System.out.println(m.getKey() + " :: " + m.getValue());
        }

    }

}
 