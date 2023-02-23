
import java.util.*;
public class Sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
            if(map.containsKey(s[i]))
            {
                map.put(s[i],map.get(s[i])+1);
            }
            else
            {
                map.put(s[i],1);
            }
        }
        System.out.println(map);
    }
}
