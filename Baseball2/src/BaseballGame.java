import java.util.*;
import java.util.Random;

//import java.util.Scanner;

public class BaseballGame {
	private static Integer[] TARGET_INTEGERS = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	public static void main(String[] args) {
		//컴퓨터 숫자 만들기
		int targetNumber = generateComputerNumber();
		//menu();
		//System.out.println(sc);
	}
	private static int generateComputerNumber() {
		List<Integer> integerList = Arrays.asList(TARGET_INTEGERS);
		Collections.shuffle(integerList);
		List<Integer> slicedList = integerList.subList(0, 3);
		
		String generatedNumber = "";
		
		for(Object i : slicedList) {
			generatedNumber += i.toString();			
		}
		
		return Integer.parseInt(generatedNumber);
	}
	

}
