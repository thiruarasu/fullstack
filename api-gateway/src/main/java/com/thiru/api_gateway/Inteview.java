package com.thiru.api_gateway;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Inteview {
	
  public static void main(String[] args) {
	
	//// find unique words		
			String word="java is fun and java is powerful";
			List<String> result=Arrays.stream(word.split(" "))
					.map(String::toLowerCase).distinct().sorted().collect(Collectors.toList());
			System.out.println("Restult string"+result);
			
			Set<String> result2=Arrays.stream(word.split(" "))
					.map(String::toLowerCase).sorted().collect(Collectors.toCollection(java.util.TreeSet::new));

			System.out.println("Restult string"+result2);
					
			List<Integer> numbers=Arrays.asList(10,8,2,3,4,22,10,20);
// find the second highest			
			Optional<Integer> secondHigher=numbers.stream()
					.sorted(Collections.reverseOrder())
					.distinct()
					.skip(1)
					.findFirst();
			
			List<List<String>> skills=Arrays.asList(
					Arrays.asList("React","java","spring","Springboot"),
					Arrays.asList("html","javascript","typescript"),
					Arrays.asList("SQL","NoSQL","Oracle")
					);
			List<String> skillsets=skills.stream()
					.flatMap(e->e.stream())
					.collect(Collectors.toList());
			         
			
			System.out.println("skillsets"+skillsets);
			
			
		   String str="LEVEL";
			
		   String str1=new StringBuilder(str).reverse().toString();
		   
		   if(str.equals(str1)) {
			   System.out.println("Polindrome");
		   } else
		   {
			   System.out.println("Not Polindrome");
		   }
		 
	
//	public static void main(String[] args)
//	{
//		List<Integer> numbers=Arrays.asList(10,8,2,3,4,22,10,20);
//		
//		Optional<Integer> secondHigher=numbers.stream()
//				.sorted(Collections.reverseOrder())
//				.distinct()
//				.skip(1)
//				.findFirst();
//// find unique words		
//		List<String> words="java is fun and java is powerful";
//		
//		
//	}

  }
}
