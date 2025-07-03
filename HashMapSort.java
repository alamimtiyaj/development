package com;


import java.util.HashMap;
import java.util.Map.Entry;

import com.bean.Book;

public class HashMapSort {

	public static void main(String[] args) {
		
		Book b1=new Book();
		b1.setId(2);
		b1.setName("Imtiyaj");
		Book b2=new Book();
		b2.setId(3);
		b2.setName("Alam");
			
		
	 HashMap<Integer,Book> hmap=new HashMap<Integer,Book>();
	 hmap.put(b1.getId(), b1);
	 hmap.put(b2.getId(), b2);
	 
	 
	 
	 for(Entry<Integer, Book> m:hmap.entrySet())
		{
			System.out.println(m.getKey()+":: "+ m.getValue());
		}

	}

}
