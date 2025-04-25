public class Call {
public static void main(String[] args) {
call(5);
}
static void call(int n)
{
    if(n==0)
    {
        return;
    }
    
    call(n-1);
    System.out.println(n);
}
}
