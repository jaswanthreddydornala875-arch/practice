import java.util.*;
public class S2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a integer:");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();


    }
}

