public class Rev {
public static void main(String[] args) {
rev(123);
}
static void rev(int n)
{
 int a,b=0;
 if(n==0)
 {
    return;
 }
a=n%10;
System.out.print((b*10)+a);
rev(n/10);
}
}