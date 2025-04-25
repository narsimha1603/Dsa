public class Sorted {
public static void main(String[] args) {
    int arr[]={1,2,7,4,3};
    int target=7;
    System.out.println(sorted(arr,target, 0));
}
static boolean sorted(int[] arr,int target,int i)
{
    if(i==arr.length-1)
    {
        return false;
    }
    return (arr[i]==target)||(sorted(arr, target, i+1)); 
}
}
