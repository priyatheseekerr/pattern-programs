import java.util.Scanner;

public class HAllowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int m=0;m<2*i+1;m++){
                if(m==0||m==2*i||i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
