package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceCountries {

	public static void main(String[] args) {
		List<String> countries =
                Arrays.asList("India", "US", "Canada",
                        "PAK", "India", "Canada", "Canada");
		//System.out.println(countries);

                List<Integer> al=Arrays.asList(1,2,3,4,3,2,5);

                
		

        Map<String, Long> result =countries.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        for(Map.Entry<String, Long> entry : result.entrySet())
        {
        	System.out.println("Country : "+ entry.getKey() +" :: Occourance : "+ entry.getValue());
        }

        Map<Integer, Long> result1 =al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        for(Map.Entry<Integer, Long> entry : result1.entrySet())
        {
        	System.out.println("Number : "+ entry.getKey() +" :: Occourance : "+ entry.getValue());
        }

	}


}
