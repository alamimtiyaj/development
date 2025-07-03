package Java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class OddEvenJava8 {

    public static void main(String[] args) {
        
        List<Integer> al=new ArrayList<>();

        al.add(3);
        al.add(4);
        al.add(11);
        al.add(13);
        al.add(14);

        List<Integer> a= al.stream().filter(i ->(i%2 ==0) ).collect(Collectors.toList());

        for(Integer i:a)
        {
            System.out.println(i);
        }

        Map<Boolean,List<Integer>> partitionValue=al.stream().collect(Collectors.partitioningBy(i -> i%2==0));
        List<Integer> evenNumber=partitionValue.get(true);
        List<Integer> oddNumber=partitionValue.get(false);

        System.out.println("Odd number is : "+oddNumber);
        System.out.println("Even number is : "+ evenNumber);

    }
    
}
