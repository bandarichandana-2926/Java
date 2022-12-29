import java.util.Scanner;

public class Multi {
    public static void main (String args[]){
         Scanner sc =new Scanner(System.in);
         int multi = sc.nextInt();
         if(multi%3==0){
           System.out.println("given number is multiple with 3");
         }else{
            System.out.println("given number is not multiple with 3");
         }
    }
}
