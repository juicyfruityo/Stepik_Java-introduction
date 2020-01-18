import java.util.Arrays;

public class mergeArrays_2_4_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[] {0, 2, 2},
                                                       new int[] {1, 3})));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int len1 = a1.length, len2 = a2.length;
        int i = 0, j = 0;

        while (i < len1 && j < len2) {
            if (a1[i] >= a2[j]) {
                res[i+j] = a2[j];
                ++j;
            } else {
                res[i+j] = a1[i];
                ++i;
            }
        }
        if (i < len1) {
            while (i < len1) {
                res[i+j] = a1[i];
                ++i;
            }
        }
        else {
            while (j < len2) {
                res[i+j] = a2[j];
                ++j;
            }
        }

        return res;
    }
}
