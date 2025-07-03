package Java8Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bean.AgeSorting;
import com.bean.Employee;
import com.bean.NameSorting;

public class ComparatorSort {

	public static void main(String[] args) {
		
		List<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee("Imtiyaj", 29, 25000,"HR"));
		al.add(new Employee("Mitesh", 26, 50000,"Testing"));
		al.add(new Employee("Aakash", 28, 55000,"developer"));
		al.add(new Employee("Deep", 27,300000,"HR"));
		
//		System.out.println("Sorting By Name:: ");
//		Collections.sort(al,new NameSorting());
//		
//		for(Employee e:al)
//		{
//			System.out.println(e);
//		}
//		
//		System.out.println("\nSorting By Age:: ");
//		
//		Collections.sort(al,new AgeSorting());
//		
//		for(Employee e:al)
//		{
//			System.out.println(e);
//		}
		
		Collections.sort(al,new NameSorting().thenComparing(new AgeSorting()));
		for(Employee e:al)
		{
			System.out.println(e);
		}
		
	}

}
