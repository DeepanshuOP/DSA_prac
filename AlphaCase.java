
import java.util.Scanner;



public class AlphaCase {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the Char:");
        Scanner input =new Scanner(System.in);
        ch=input.nextLine().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Its uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("It's Lowercase.");
        }
        else{
            System.out.println("Not an alphabet.");
        }
        }
    }
