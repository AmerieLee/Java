package javaPrj;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IoTest {
	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//int[] scores = {23,43,62,88,81,23};
	//boolean success = false;
	
	try {
	while (sc.hasNextLine()) {

	   String line = sc.nextLine();
	   System.out.println(line);
	}
	}
	catch(NullPointerException e){
		System.out.println("Null~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
	}
	sc.close();


	}
}

