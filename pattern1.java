//Rectangle pattern
import java.util.*;
public class pattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}