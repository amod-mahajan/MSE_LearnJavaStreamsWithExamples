package solveproblemswithsreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromListUsingStreamAPI {
	
	public static void main(String[] args) {
		// Original List with duplicate values
		List<String> listWithStringValues = Arrays.asList("Java","Selenium","Physics","Selenium");
		
		// Remove duplicates using without stream 
		List<String> listWithoutDuplicateValuesWithoutStream = new ArrayList<>();
		for(String ele : listWithStringValues) {
			if(!listWithoutDuplicateValuesWithoutStream.contains(ele)) {
				listWithoutDuplicateValuesWithoutStream.add(ele);
			}
		}
		System.out.println("Actual Data : "+ listWithStringValues);
		System.out.println("After removing duplicate Data : "+ listWithoutDuplicateValuesWithoutStream);
		
		System.out.println("======================================================================");
		
		// Remove duplicates using with stream 
		List<String> listWithoutDuplicateValuesWithStream = 
				listWithStringValues
				.stream() // To get a sequential stream 
				.distinct() // To get unique elements
				.collect(Collectors.toList()); // After removing duplicate save or collect in to a list
		System.out.println("Actual Data : "+ listWithStringValues);
		System.out.println("After removing duplicate Data : "+ listWithoutDuplicateValuesWithStream);
	}

}
