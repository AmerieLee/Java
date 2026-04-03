package javaPrj;

public class Grade {
    public static void main(String[] args) {
        printGrade(96);
        printGrade(86);
        printGrade(70);
        printGrade(55);
    }

    // A method that inputs a score and outputs the grade.
    public static void printGrade(int score) {
        String grade = "";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.printf("score %d: %s\n", score, grade);
        
        System.out.println("Java Github test!!!!!!");
        
        
    }
}

