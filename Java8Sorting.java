package Java8Example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.bean.Employee;

public class Java8Sorting {

	public static void main(String[] args) {
		
		List<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee("Aakash Binwal", 28,40000,"HR" ));
		al.add(new Employee("Imtiyaj Alam", 27, 50000,"Developer"));
		al.add(new Employee("Prashant Tiwari", 25,30000,"HR" ));
		al.add(new Employee("Aslam", 26, 60000,"Testing"));
		al.add(new Employee("Imtiyaj", 29, 6000,"HR"));
		
		//Print Name
		List<String> names=al.stream().map(name-> name.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		// Sort by Salary desc to asc
		List<Employee> l=al.stream().sorted((o1, o2) -> (int)(o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		// Max Salary
		Optional<Employee> i= al.stream().max((o1, o2) -> (int)(o1.getSalary() - o2.getSalary()));
		System.out.println("Max :: "+i);
		System.out.println("Max Salary emp :: "+i.get().getName());
		
		// Sort salary by filtering whose age is less then 27
		//List<Employee> l1=al.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());//comparing(Employee::getName)
		List<Employee> l1=al.stream().filter(e->e.getAge()<=27).sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println("Based on age: "+l1);
		
		//Min Age
		Integer minAge=al.stream().map(ag->ag.getAge()).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("minAge: "+minAge);

		//Min Age another way
		Employee minimumAge= al.stream().min(Comparator.comparing(Employee::getAge)).get();
		System.out.println("minimumAge is :: "+ minimumAge.getName());
		
		for(Employee e:l)
		{
			System.out.println("Sorted : "+e);
		}
		
		//filter the name whose name is Imtiyaj
		List<String> emp= al.stream().map(name->name.getName()).filter(s-> s.equals("Imtiyaj")).collect(Collectors.toList());
		System.out.println("EmpName : "+ emp);

		//filter using Optional class if value is not present in the list.
		Optional<List<String>> optional1=Optional.of(emp);   //here we are pass emp object which we filtered
		System.out.println("Optional :: "+optional1.get().isEmpty());


		//Max Salary
		Employee highestSalaryEmp= al.stream().max(Comparator.comparing(Employee::getSalary)).get();  //get().getName();
		System.out.println("highestSalaryEmp : " + highestSalaryEmp.getName());

		// 2nd Highest salary
		Optional<Integer> secondHighestsalary = al.stream().map(Employee::getSalary).distinct().
		sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("secondHighestsalary:: " + secondHighestsalary);

		// Max Salary Another way 

		Optional<Employee> emp1=al.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println("HighestEmpyeeSalaryName : "+ emp1.get().getName());

		//Find Max salary from HR department
		String highestSalaryEmpFromHR= al.stream().filter(h-> h.getDepartment().equals("HR")).max(Comparator.comparing(Employee:: getSalary)).get().getName();
		System.out.println("highestSalaryEmpFromHR is : "+ highestSalaryEmpFromHR);

		//find Average salary of Emp whose age is gt>25 && ls<27
		OptionalDouble avgSalary=al.stream().filter(ag-> ag.getAge()>25 && ag.getAge()<=27).mapToInt(Employee::getSalary).average();
		System.out.println("Average salary is: "  + avgSalary);

		// Count the Salary of Emp
		long countEmp=al.stream().filter(ag-> ag.getAge()>25 && ag.getAge()<=27).mapToInt(Employee::getSalary).count();
		System.out.println("Count the Salary : "+ countEmp);

		// Sum the Salary of Emp
		int sumOfSalary=al.stream().filter(ag-> ag.getAge()>25 && ag.getAge()<=27).mapToInt(Employee::getSalary).sum();
		System.out.println("Sum of the Salary : "+ sumOfSalary);

		//Using Statics we can find min,max,avg,sum,count
		IntSummaryStatistics stats=al.stream().filter(ag-> ag.getAge()>25 && ag.getAge()<=27).mapToInt(Employee::getSalary).summaryStatistics();
		System.out.println("Summary Statics: "+ stats.getSum());

		Optional<Employee> empName=al.stream().filter(n-> n.getName().equalsIgnoreCase("imtiyaj")).findFirst();
		Optional.empty();

		System.out.println("Optional findAny() method : " + empName.get().getName());

		al.parallelStream().map(p -> p.getAge()).forEach(System.out :: println);
		
	
	}

}
