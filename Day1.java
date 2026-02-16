import java.util.*;
public class Day1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter integer:");
        i=sc.nextInt();
        for(int j=1;j<=i;j++){
            for(int k=1;k<=j;k++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}