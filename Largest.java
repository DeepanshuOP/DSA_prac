import java.util.*;

public class Largest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
         int a,b,c;
         System.out.println("Enter the Numbers: ");
         a= input.nextInt();
         b= input.nextInt();
         c= input.nextInt();
         if(a>=b && a>=c){
            System.out.println("A is the Largest.");
         }
         else if(b>=a && b>=c){
            System.out.println("B is largest.");
         }
         else{
            System.out.println("C is largest.");
         }
    }
}
