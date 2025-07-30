
public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 54, 546, 4531, 342, 435, 645, 234, 123, 234, 5665, 5, 335};
        System.out.println(Maximum(arr));
    }

    static int Maximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
