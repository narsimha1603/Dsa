import java.util.Arrays;

public class BubSort {
public static void main(String[] args) {
    int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
       
        bs(arr, arr.length); 
          
        System.out.println("Sorted array : "); 
        System.out.println(Arrays.toString(arr));
}
static void bs(int arr[],int n)
{
    if(n==1)
    {
        return;
    }
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>arr[i+1])
        {
            //swp
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    bs(arr,n-1);
}
}
