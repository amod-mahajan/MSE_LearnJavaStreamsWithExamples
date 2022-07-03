package solveproblemswithsreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromListUsingStreamAPI {
	
	public static void main(String[] args) {
		// Original List with duplicate values
		List<String> listWithStringValues = Arrays.asList("Java","Selenium","Physics","Selenium", "Python", "Python");
		List<String> listWithoutDuplicate = new ArrayList<>();
		for(String ele : listWithStringValues)
		{
			if(!listWithoutDuplicate.contains(ele))
				listWithoutDuplicate.add(ele);
		}
		System.out.println("Before removing duplicate : "+listWithStringValues);
		System.out.println("After removing duplicate  : "+ listWithoutDuplicate);
		
		System.out.println("================================================");
		
		List<String> listWithoutDuplicate1 = listWithStringValues
			.stream()
			.distinct()
			.collect(Collectors.toList());
		System.out.println("Before removing duplicate : "+listWithStringValues);
		System.out.println("After removing duplicate  : "+ listWithoutDuplicate1);
	}

}
