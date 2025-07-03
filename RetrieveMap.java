package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;


public class RetrieveMap {

	public static void main(String[] args) {
	List<String> al=new ArrayList<String>();
		
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1, "Imtiyaj");
		hmap.put(2, "Alam");
		hmap.put(3, "Aakash");
		hmap.put(4, "Prashant");
		System.out.println(hmap.get(2));
		al.add(hmap.get(2));
		
		for(String i:al)
		{
			System.out.println(i);
		}
		//System.out.println("List: "+al.get(0));
		
		for(Entry<Integer, String> m:hmap.entrySet())
		{
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		

	}

}
