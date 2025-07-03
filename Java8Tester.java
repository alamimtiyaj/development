package Java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import com.bean.Employee;

public class Java8Tester {

	public static void main(String[] args) {
		
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("Aakash Binwal", 28, 60000,"HR"));
		al.add(new Employee("imtiyaj Alam", 27, 50000,"Testing"));
		al.add(new Employee("Prasnat Tiwari", 25, 40000,"Testing"));
		al.add(new Employee("Aslam", 26, 30000,"Development"));
		
		System.out.println(al.toString());
		
//		List<Employee> n=al.stream().filter(s-> s.getSalary()>=40000).collect(Collectors.toList());
//		for(Employee i:n)
//		{
//			System.out.println(i);
//		}
//		List<Integer> n=al.stream().filter(s->s.getAge()>=26).map(s->s.getSalary()*11).collect(Collectors.toList());
//		System.out.println(n.toString());
		
		List<Employee> n=al.stream().map(s->{
			if(s.getAge()>=26)
			{
				s.setSalary(s.getSalary()*12);
			}
			return s;
		}).collect(Collectors.toList());
		
		System.out.println(n);
	}

}
