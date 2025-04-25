import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {
        System.out.println(dice("", 5));
    }
    static ArrayList<String> dice(String s,int target)
    {
        if(target==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=target; i++) {
        list.addAll(dice(s+i, target-i));            
        }
        return list;
    }
}