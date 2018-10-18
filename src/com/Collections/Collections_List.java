package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Collections_List {

	public static void main(String[] args) {
		
		
		List lst=new ArrayList();
		lst.add("hello");
		
		lst.add("where");
		
		lst.add(1);
		
		
		
		
		for(int i=0;i<=lst.size()-1;i++)
		{
			System.out.println(lst.get(i));
		}
		
		
	/*	
		
		
		for (Object object : lst) {
			
			
			System.out.println(object);
			
		}
	*/	

	}

}
