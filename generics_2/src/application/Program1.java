package application;

import java.util.Arrays;
import java.util.List;

public class Program1 {
	
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> s = Arrays.asList("Maria","Alex","BOb");
		printList(s);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
