public class BS {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60,70};
        System.out.println(BS(arr, 10, 0, arr.length - 1));
    }

    static int BS(int[] arr, int tar, int s, int e) {
        int m = s + (e - s) / 2;
        while (s <= e) {
            if (arr[m] == tar) {
                return m;
            }
            if (tar < arr[m])
                return BS(arr, tar, s, m - 1);
            if(tar>arr[m])
                return BS(arr, tar, m + 1, e);
        }
        return -1;
    }
}