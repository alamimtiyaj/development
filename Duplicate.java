package com.util;

import java.util.*;
import java.util.stream.Collectors;
public class Duplicate {
    public static void main(String args[]) {
      
    //   List<Employee> al=new Arraylist();
      
    //   Optional<Emplyee> maxSalry= al.stram().filter(h-> h.getDep.equal("HR")).max(Comparator.comparing(Employee: getSalry)).get
    //     maxSalry.getName();
    
    //int[] arr={1,2,3,4,3,2,5};
    
    List<Integer> al=Arrays.asList(1,2,3,4,3,2,5);
    
    List<Integer> freq=al.stream().filter(i -> Collections.frequency(al,i)>1).collect(Collectors.toList());
    
    System.out.println(freq);
    }
}