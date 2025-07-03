package Java8Example;

import java.util.Arrays;
import java.util.List;

public class StreamVsParallelStream {
	
	public static void main(String[] args) {
		
		List<Integer> al=Arrays.asList(1,2,3,4,5,6,7,8);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		al.stream().map(i->i*2).forEach(System.out::println);
		
		System.out.println("In Parallel Stream");
		
		//its depends on Core which is available in task manager
		al.parallelStream().map(i->i*2).forEach(System.out::println);
		
		System.out.println("Normal printing");
		al.stream().map(i->i).forEach(System.out::println);
		
		System.out.println("Filtering Spring value printing");
		courses.stream().filter(i->i.equals("Spring")).forEach(System.out::println);

		
		
	}
	
			
}
