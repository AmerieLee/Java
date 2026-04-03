package javaPrj;
import java.util.ArrayList;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int result = 0; for (int i = 1; i <= 6; i++) { if (i % 2 == 0) { continue; }
		 * if (i == 5) { break; } result += i; } System.out.println("Result: " +
		 * result);
		 * 
		 * for (int i = 0; i < 3; i++) { for (int j = 1; j <= 2; j++) {
		 * System.out.println("Hello"); } }
		 */

		// part A
		int[] scores = { 90, 85, 70, 95 };
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		// part C
		int[] numbers = { 12, 45, 3, 67, 34 };

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max :  " + max);

		// part B & E
		int[] values = { 5, 10, 15, 20 };
		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		double average = (double) sum / values.length;

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		
		//import java.util.ArrayList;
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		ArrayList<String> menu = new ArrayList<>();
		menu.add("Pizza");
		menu.add("Burger");
		menu.add(1, "Pasta");
		menu.set(0, "Salad");
		menu.remove(2);
		System.out.println(menu + " Size: " + menu.size());
		
		for (int i = 0; i < menu.size(); i++) {
			System.out.println("menu"+i+": "+menu.get(i));
		}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		ArrayList<String> words = new ArrayList<>(); 
		words.add("Java");
		words.add("Python");
		words.add("C++");
		words.set(2, "JavaScript");
		System.out.println(words.get(0));
		
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++2D  Array++++++++++++++Part B++++++++++++++++++++++++++++++++++++");
		
		int[][] matrix = {{5, 2}, {8, 3}};
		for (int r = 0; r < matrix.length; r++) {
		   for (int c = 0; c < matrix[r].length; c++) {
		       System.out.print(matrix[r][c] + " ");
		   }
		   System.out.println(); //For grid formatting
		}
		
		System.out.println("+++++++++++++++++++++++++++++++2D  Array++++++++++++++Part C++++++++++++++++++++++++++++++++++++");	
		
		int[][] map = {{1, 3}, {7, 9}, {4, 0}};
		int target = 7;
		int foundRow = -1, foundCol = -1;

		for (int r = 0; r < map.length; r++) {
		   for (int c = 0; c < map[r].length; c++) {
		       if (map[r][c] == target) {
		           foundRow = r;
		           foundCol = c;
		       }
		       System.out.print(map[r][c] + " ");
		   }
		   System.out.println(); //For grid formatting
		}

		   System.out.println("foundRow : "+foundRow + "\n" +"foundCol : "+foundCol); 
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   String[] fruits = {"apple", "banana", "cherry"};
		   for (int i = 0; i < fruits.length; i++) {
		       System.out.println(fruits[i]);
		   }
		   
		   
		   
		   for (String fruit : fruits) {
			    System.out.println(fruit); // 코드가 훨씬 간결함
			}


	}

}
