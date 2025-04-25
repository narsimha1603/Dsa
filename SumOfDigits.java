public class SumOfDigits {
public static void main(String[] args) {
    System.out.println(sum(123));
}
static int sum(int n)
{
    int a,c=0;
   while(n>0)
   {
    a=n%10;
    n=n/10;
    c=c+a;
   }
   return c;
}
}
