import java.util.Arrays;

public class SumTriArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        func(arr);
    }
    public static void func(int[] a)
    {
        if(a.length<1)
        {
            return;
        }
        int[] b = new int[a.length-1];
        for(int i=0;i<a.length-1;i++)
        {
            int z=a[i]+a[i+1];
            b[i]=z;
        }
        func(b);
        System.out.println(Arrays.toString(b));
    }
}
