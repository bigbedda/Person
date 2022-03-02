package Main;

import person.Person;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Runner {

	public static void main(String[] args) {
	
		List<String> nameList = new ArrayList<>();
		Stream<String> nameStream = nameList.stream();
		
		nameList.add("Lister");
		nameList.add("Rimmer");
		nameList.add("Cat");
		nameList.add("Kryten");
		
		nameList.forEach(words -> System.out.println(words));
		
		List<Integer> ageList = new ArrayList<>();
		Stream<Integer> ageStream = ageList.stream();
		
		ageList.add(42);
		ageList.add(44);
		ageList.add(29);
		ageList.add(20);
		
		ageList.forEach(age -> System.out.println(age));
		
		List<String> jobList = new ArrayList<>();
		Stream<String> jobStream = jobList.stream();
		
		jobList.add("Vending machine technicial");
		jobList.add("Smeghead");
		jobList.add("Ship's cat");
		jobList.add("Service Droid");
		
		jobList.forEach(job -> System.out.println(job));
		
	    }

	
}
