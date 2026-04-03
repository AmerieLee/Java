package javaPrj;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Hello World!!!");
		/*
		 * int midScore; // 중간 점수 int finalScore; // 기말 점수 int totalScore; boolean test;
		 * String errTest = "Hochiminh"; String err = "Hochiminh"; String errT =
		 * errTest;
		 * 
		 * midScore = 68; finalScore = 88; totalScore = midScore + finalScore; test =
		 * false;
		 * 
		 * 
		 * System.out.println("mid Term Score:"+ midScore);
		 * System.out.println(midScore); System.out.println("final Term Score:");
		 * System.out.println(finalScore); System.out.println("total Score:");
		 * System.out.println(totalScore); System.out.println(test);
		 * System.out.println(errT==err);
		 */
		/*
		 * int n = -4; if (n > 0) if (n % 2 == 0) System.out.println(n); else
		 * System.out.println(n + " is not positive");
		 */

		
		/*
		 * int n = 0; if (n>0) { if( n % 2 == 0) System.out.println(n); } else {
		 * if(n==0) { System.out.println("n is 0."); } else
		 * System.out.println(n+" is not positive"); }
		 */
		  
		 
	  System.out.println("================if else if=======================");	
	 
	  String grade = "B"; 
	  if(grade.equals("A")) 
		  System.out.println("Excellent!!");
	  else if(grade.equals("B")) 
		  System.out.println("Good!"); 
	  else
	  System.out.println("Invalid Value");

	  
	  System.out.println("=================for ======================");
	  
	  
	
	  int i; 
	  for(i=1; i<5; i++) { 
		  System.out.print(i+" ");
	  }
	  System.out.println("\n");  
	  
	  System.out.println("=================while  ======================");	  
	  
	  int v = 1; 
	  int mul = 3; 
	  
	  while(mul <20) {
		  
		  System.out.println("mul : "+mul +" "); 
		  v++; 
		  mul *= v; 
		  
	  }
	  
	  
	  System.out.println("=================nested loops(For)  ======================");	  
	  
	  for(int k = 1; k <=6; k++) {
		  for(int j = 1; j<=k; j++) {
			  System.out.print("+");
			  
		  }
		  System.out.println();
	  }

	  
	  System.out.println("=================Type casting  ======================");		
	  
	  
      int x = 7 / 2;
      double y = 7 * 2.0;
      System.out.printf("x = %d, y = %f", x, y);
	  
	  System.out.println();
	  
	  System.out.println("=================Type casting  ======================");		  
	  
      // Variable
      String title = "Romeo and Juliet";
      String author = "William Shakespeare";
      double price = 5.94;

      // Print
      System.out.printf("Title: %s\n", title);
      System.out.printf("Author: %s\n", author);
      System.out.printf("Price: $%f\n", price);

      
	//double answer = (double)13/5;
	//System.out.println("1/5=" +answer);
	
	double tet = 22.21;
    System.out.println(3.0==tet *(3.0/tet));
    
	}

}
