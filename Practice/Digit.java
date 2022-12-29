import java.util.Scanner;
public class Digit {
    public static void main(String args[]){
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the number");
       int i = sc.nextInt();
       if(i > 99 && i < 1000){
          System.out.println("given number is 3 digit");
       }
       else {
        System.out.println("given number is not 3 digit");
       }
    }
}
