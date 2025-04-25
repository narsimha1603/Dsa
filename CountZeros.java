public class CountZeros {
public static void main(String[] args) {
    System.out.println(count(1010, 0));
}
static int count(int n,int c)
{
    int a;
    if(n==0)
    {
        return c;
    }
    a=n%10;
    if(a==0)
    {
        return count(n/10, c+1);
    }
    return count(n/10,c);
}
}