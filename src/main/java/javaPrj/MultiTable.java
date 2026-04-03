package javaPrj;

public class MultiTable {
	
    String name; // name
    String breeds; // breed
    double weight; // weight

    void claw() {
        System.out.println("claw!!");
    }

    void meow() {
        System.out.println("meow~");
    }

	
	
    public static void main(String[] args) {
        int[][] gugudan = new int[10][10];
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                gugudan[i][j] = i * j;
            }
        }
        System.out.printf("2 x 7 = %d\n", gugudan[0][5]);
        System.out.printf("1 x 7 = %d\n", gugudan[1][7]);
        System.out.printf("2 x 7 = %d\n", gugudan[2][7]);
        System.out.printf("9 x 4 = %d\n", gugudan[9][4]);
        System.out.printf("4 x 4 = %d\n", gugudan[4][4]);
        
        
        MultiTable c = new MultiTable();

        // changing field
        c.name = "Nero";
        c.breeds = "Persian";
        c.weight = 4.37;

        // printing field
        System.out.printf("NAME: %s \n", c.name);
        System.out.printf("BREEDS: %s \n", c.breeds);
        System.out.printf("WGT: %.2f kg \n", c.weight);


    }
}

