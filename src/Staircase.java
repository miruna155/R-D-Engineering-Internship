public class Staircase {
    public static void main(String[] args) {
        int n = 4;
        printStaircase(n);
    }


    public static void printStaircase(int n) {
        //loop for each row
        for (int i = 0; i < n; i++) {
            //loop to print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //loop to print '#' symbols
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

