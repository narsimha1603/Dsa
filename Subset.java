class SubSet
{
    public static void main(String[] args) {
        subset("","abc");
    }
    static void subset(String p,String up)
    {
        if(up.length()==0)
        {
            System.out.println(p);
            return;
        }
        char c=up.charAt(0);
        subset(p+c, up.substring(1));
        subset(p, up.substring(1));
    }
}