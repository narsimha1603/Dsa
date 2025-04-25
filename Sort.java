import java.util.Arrays;

public class Sort {
public static void main(String[] args) {
    int[] arr = {0,1,1,0,0,0};
    System.out.println(Arrays.toString(sort(arr)));
}
static int[] sort(int[] arr) {
    while(arr.length > 1) {
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        left = sort(left);
        right = sort(right);
        arr = merge(left, right);
    }
    return arr;
}
static int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int i = 0, j = 0, k = 0;
    while(i < left.length && j < right.length) {
        if(left[i] <= right[j]) {
            result[k++] = left[i++];
        } else {
            result[k++] = right[j++];
        }
    }
    while(i < left.length) {
        result[k++] = left[i++];
    }
    while(j < right.length) {
        result[k++] = right[j++];
    }
    return result;
}
}