import java.util.ArrayList;
import java.util.List;

public class Phonepad {
public static void main(String[] args) {
    List<String> l=padRet("","23");
    System.out.println(l);
}
static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(up.length()!=0){
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        if (digit == 0 || digit == 1) {
            return padRet(p, up.substring(1)); // skip 0 and 1
        }
        }
        ArrayList<String> list = new ArrayList<>();
        int digit=0;
        int start = (digit == 7 || digit == 9) ? (digit - 2) * 3 + 1 : (digit - 2) * 3;
        int end = (digit == 7 || digit == 9) ? start + 4 : start + 3;

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }
}