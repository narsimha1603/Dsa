public class StepsToZero {
   static int help(int n,int s)
   {
    if(n==0)
    {
        return s;
    }
    if(n%2==0)
    {
        return help(n/2, s+1);
    }
    return help(n-1, s+1);
   }
   public static void main(String[] args) {
    System.out.println(help(10, 0));
   }
}
