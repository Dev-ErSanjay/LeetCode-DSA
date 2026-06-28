import java.util.Arrays;

public class MaxElementAfterDecrementRearrange {

    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        if (arr == null || arr.length == 0)
            return 0;

        Arrays.sort(arr);
        arr[0] = 1;

        for (int i = 1; i < arr.length; i++)
            if (arr[i] - arr[i - 1] >= 1)
                arr[i] = arr[i - 1] + 1;

        return arr[arr.length - 1];
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 2, 1 };
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }
}
