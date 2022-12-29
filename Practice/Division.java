import java.util.Scanner;

public class Division {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int div = sc.nextInt();
    if(div% 7 == 0){
        System.out.println("given number is divisible by 7");

    }
    else{
        System.out.println("given number is not divisible by 7");
    }
    }}