package Java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.entity.Employee;

public class Frequency {

    public static void main(String[] args) {
        
        List<Employee> al= new ArrayList<Employee>();

    Employee emp=new Employee();
     emp.setId(1);
     emp.setName("Alam");
     emp.setCompanyName("Hcl");

     Employee emp1=new Employee();
     emp1.setId(2);
     emp1.setName("Imtiyaj");
     emp1.setCompanyName("Qtek");

     Employee emp2=new Employee();
     emp2.setId(3);
     emp2.setName("Alam");
     emp2.setCompanyName("CG");

     al.add(emp);
     al.add(emp1);
     al.add(emp2);

     for(Employee e: al)
     {
        System.out.println("Data : "+ e.getCompanyName());
     }

     Map<Employee, Long> result =al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        for(Map.Entry<Employee, Long> entry : result.entrySet())
        {
        	System.out.println("Number : "+ entry.getKey() +" :: Occourance : "+ entry.getValue());
        }

    }
    
}
