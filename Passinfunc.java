
import java.util.Arrays;

public class Passinfunc {

    public static void main(String[] args) {
        int[] num = {3, 54, 35, 234, 23242,};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }

    public static void change(int[] arr) {
        arr[0] = 99;
    }
}
