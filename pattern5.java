import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=1;row<num;row++){
            for(int col=1;col<num-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
