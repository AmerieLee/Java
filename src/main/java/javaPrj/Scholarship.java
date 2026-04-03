package javaPrj;

public class Scholarship {
    public static void main(String[] args) {
        printScholarship("Park", 100, 92);
        printScholarship("Kim", 82, 96);
        printScholarship("Choi", 82, 88);
    }

    // A method that takes an integer as input and outputs whether it is odd or even.
    public static void printScholarship(String name, int math, int eng) {
        String result = "";

        if (math >= 90 && eng >= 90) {
            result = "full scholarship!";
        } else if (math >= 90 || eng >= 90) {
            result = "half scholarship!";
        } else {
            result = "Sorry next time~";
        }
        System.out.printf("%s => %s\n", name, result);
    }
}