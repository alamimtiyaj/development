import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Java8Example {

    public static void main(String[] args) {
        
        String[] arr={"Spring", "hibernate","Spring", "Springboot"};

        List<String> al=new ArrayList<String>();
        al.add("Spring");
        al.add("Hibernate");
        al.add("Springboot");
        al.add("Spring");
        al.add("SpringMVC");


        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Printing : "+arr[i]);
        }

        al.stream().filter(j ->j.equals("Spring")).forEach(System.out :: println);

        System.out.println(" ------------ 1st ----------- ");


       List<String> a= al.stream().filter(j ->j.equals("Spring")).collect(Collectors.toList());
       for(String k:a)
       {
        System.out.println("Filter: " +k);
       }

       System.out.println(" ---------- 2nd ------------- ");

       al.stream().filter(l ->l.equals("Spring")).forEach(product -> System.out.println(product));


    }
    
}
