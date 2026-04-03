package javaPrj;

public class Test {
    public static void main(String[] args) {
        buy(20);
        buy(18);
    }

    // Depending on the input age, output whether can purchase beer
    public static void buy(int age) {
        if (age >= 19) {
            System.out.printf("%d years, Can buy beer\n", age);
        } else {
            System.out.printf("%d years, Can not buy beer\n", age);
        }
    }
}
