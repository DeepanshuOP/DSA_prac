
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        Scanner in=new Scanner(System.in);
        // list.add(63453);
        // list.add(664645);
        // list.add(6856);
        // list.add(6536);
        // list.add(632);
        // list.add(64234);
        // list.add(6932);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        // System.out.println(list);
        for(int i=0;i<5;i++){
            System.out.print(list.get(i));
        }
    }
}
