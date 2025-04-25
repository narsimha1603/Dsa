public class UpperCaseLetter {
    public static void main(String[] args) {
        char a=letter("abHi");
        System.out.println(a);
    }
    static char letter(String s)
    {
        for(int i=0;i<=s.length()-1;i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                return s.charAt(i);
        }
        return 0;
    }
}
