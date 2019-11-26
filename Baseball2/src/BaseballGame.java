import java.util.*;
import java.util.Random;

//import java.util.Scanner;

public class BaseballGame {
	private static Integer[] TARGET_INTEGERS = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	public static void main(String[] args) {
		//컴퓨터 숫자 만들기
		List<Integer> computerNumber = generateComputerNumber();
		
		List<Integer> userNUmber = getUserNumber();
		//System.out.println(sc);
	}
	private static List<Integer> generateComputerNumber() {
		List<Integer> integerList = Arrays.asList(TARGET_INTEGERS);
		Collections.shuffle(integerList);
		List<Integer> slicedList = integerList.subList(0, 3);
		
		return slicedList;
	}
	private static List<Integer> getUserNumber() {
		final Scanner scanner = new Scanner(System.in);
	}

}
