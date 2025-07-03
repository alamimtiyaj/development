package Java8Example;

import java.util.*;

import com.bean.Student;

public class ComparableSortEx {

	public static void main(String[] args) {
		
		List<Student> al=new ArrayList<Student>();
		
		Student s1=new Student();
		s1.setRollNo(103);
		s1.setName("Imtiyaj");
		Student s2=new Student();
		s2.setRollNo(101);
		s2.setName("Prashant");
		Student s3=new Student();
		s3.setRollNo(105);
		s3.setName("MS");
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		//Collections.sort(al,Collections.reverseOrder()); //for reverse
		for(Student s:al)
		{
			System.out.println(s);
		}

	}

}
