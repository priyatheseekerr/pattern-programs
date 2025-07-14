import java.util.Scanner;

public class AlphaDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {

            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (i) + 1); j++) {
                char c = (char) ('A' + j);
                System.out.print(c);
            }

            System.out.println();
        }
        for (int i = 0; i < n; i++) {

            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                char c = (char) ('A' + j);
                System.out.print(c);
            }

            System.out.println();
        }
        sc.close();
    }
}
