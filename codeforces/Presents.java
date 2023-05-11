
//http://codeforces.com/contest/136/problem/A
import java.util.*;

public class Presents {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer,Integer> gifts = new HashMap<>();
        for (int i=0 ; i< n;i++)
            gifts.put(input.nextInt(),i+1);

        for (int i=0 ; i< n;i++)
        {
            int friend = gifts.get(i+1);
            System.out.print(friend +" ");
        }
    }
}
