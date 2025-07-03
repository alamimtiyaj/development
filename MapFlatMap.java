package Java8Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.bean.Customers;

public class MapFlatMap {
	
	public static void main(String[] args) {
		
		List<Customers> customers=new ArrayList<Customers>();
		customers.add(new Customers(101, "Imtiyaj","imtiyaj.alam@us.com",Arrays.asList("70659858","222162")));
		customers.add(new Customers(102, "Alam","alamcs@us.com",Arrays.asList("222162","110096")));
		customers.add(new Customers(103, "CG","CG@us.com",Arrays.asList("222165","110097")));
		//System.out.println(customers);
		
		//cust->cust.getName() one to one mapping using map()
		List<String> names=customers.stream().map(cust->cust.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		//cust->cust.getNumber() one to one mapping using map()
		List<List<String>> numbers=customers.stream().map(cust->cust.getNumber()).collect(Collectors.toList());
		System.out.println("Map: " + numbers);
		
		//cust->cust.getNumber() one to many mapping using flatmap()
		List<String> number=customers.stream().flatMap(cust->cust.getNumber().stream()).collect(Collectors.toList());
		System.out.println("FlatMap: " + number);
		
		//filter 1st way
		List<Integer> ids= customers.stream().filter(custid-> custid.getId()>101).map(cust->cust.getId()).collect(Collectors.toList());
		System.out.println(ids);
		
		//filter 2nd way
		List<Customers> idss= customers.stream().filter(custid-> custid.getId()>101).collect(Collectors.toList());
		for(Customers c:idss)
		{
			System.out.println("id: "+c.getId());
		}
		
		//filter 3rd way using toString()
		customers.stream().filter(custid-> custid.getId()>101).forEach(System.out::println);
		
		
	}

}
