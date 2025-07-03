package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Vowel {

    public static void main(String[] args)
    {
        //List<String> number = Arrays.asList("70659858","222162");
        List<String> vowel= List.of("I","m","t","i","y","a","j");
        List<String> vow= vowel.stream().filter(ch-> (ch.equalsIgnoreCase("a") ||ch.equalsIgnoreCase("e")||
        ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u"))).collect(Collectors.toList());

        long vowelChar= vowel.stream().filter(ch-> ch.equalsIgnoreCase("a") ||ch.equalsIgnoreCase("e")||
        ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")).count();
        
        System.out.println("List of vowel: "+ vow);
        System.out.println("List of vowel: "+ vowelChar);
    }
    
}
