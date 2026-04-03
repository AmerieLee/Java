package javaPrj;

public class OddOrEven {
    public static void main(String[] args) {
        printResult(13);
        printResult(6);
    }

    // A method that takes an integer as input and outputs whether it is odd or even.
    public static void printResult(int n) {
        String result = (n % 2 == 0) ? "even" : "odd";
        System.out.printf("Integer %d is %s \n", n, result);
    }
}