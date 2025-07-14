import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int m = i - 1; m >= 1; m--) {
                System.out.print(m);
            }
            System.out.println();
        }
        sc.close();
    }
}
