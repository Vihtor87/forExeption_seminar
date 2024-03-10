import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        int[] x = {4, 5, 6};
        int[] y = {1, 2, 3, 7};
        System.out.println(Arrays.toString(subArrays(x, y)));
    }
    public static int[] subArrays(int[] a, int[] b) {
        int[] res;
        int[] resArr;
        if (a.length != b.length) {
            res = new int[]{0};
        } else {
            resArr = new int[a.length];
            for (int i = 0; i < resArr.length; i++) {
                resArr[i] = a[i] - b[i];
            }
            return resArr;
        }
        return res;
    }
}