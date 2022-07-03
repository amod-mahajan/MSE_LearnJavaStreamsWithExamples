package solveproblemswithsreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListUsingJavaStreamAPI {
	
	public static void main(String[] args) {
		
		List<String> allSubjets = Arrays.asList("Java","Functional Testing", "Performace Testing", "Selenium Testing", "Mongo DB");
		List<String> allTestingSubjects = new ArrayList<>();
		
		// Iterating the list
		for(String ele : allSubjets)
		{
			// filter condition
			if(ele.contains("Testing"))
				allTestingSubjects.add(ele);	
		}
		
		System.out.println("All subjects : "+ allSubjets);
		System.out.println("All testing subjects : "+ allTestingSubjects);
		
		List<String> allTestingSubjects1 = 
		allSubjets
			.stream()
			.filter(ele -> ele.contains("Testing") && ele.contains("Selenium"))
			.collect(Collectors.toList());
			
		System.out.println("All subjects : "+ allSubjets);
		System.out.println("All testing subjects : "+ allTestingSubjects1);
	}
}
