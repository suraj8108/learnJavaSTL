package abasics;

import java.util.*;
import java.util.stream.Collectors;

public class A6JavaStream {

	public static void main(String[] args) {
		List<Integer> elements = new ArrayList<>();
		Collections.addAll(elements, 53,24,24,64,7354,3,5,23,56,45);
		
		//Map
		List<Integer> twice = elements.stream().map(element -> element*2).collect(Collectors.toList());
		System.out.println(twice);
		
		//Filter
		List<Integer> filterData= elements.stream().filter((element) -> element > 30).collect(Collectors.toList());
		System.out.println(filterData);
		
		//Get Unique element
		List<Integer> uniqueSortedElement = elements.stream().distinct().sorted().limit(1).collect(Collectors.toList());
		System.out.println(uniqueSortedElement);
		
		boolean anymatch = elements.stream().anyMatch(element -> element%2==0);
		boolean allmatch = elements.stream().allMatch(element -> element%2==0);
	}
}
