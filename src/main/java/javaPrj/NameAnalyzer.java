package javaPrj;
import java.util.Scanner;

public class NameAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        // 1. Length
        System.out.println("1. Length: " + name.length());

        // 2. First Character
        System.out.println("2. First Character: " + name.substring(0, 1));
        
        // 3. Last Character (Important for AP Exam!)
        // Index is always length - 1
        String lastChar = name.substring(name.length() - 1);
        System.out.println("3. Last Character: " + lastChar);

        // 4. Index of first space
        int spaceIndex = name.indexOf(" ");
        System.out.println("4. Index of first space: " + spaceIndex);

        // 5. Check if it contains "Java"
        System.out.println("5. Contains 'Java'?: " + name.contains("Java"));
        
        sc.close();

	}

}
