
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=input.nextInt();
        int rev=0;
        while(a>0){
            int rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        System.out.println("The reverse Number is:"+rev);
        input.close();
    }
}
