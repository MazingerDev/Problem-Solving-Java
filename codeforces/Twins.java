//http://codeforces.com/contest/160/problem/A

import java.util.*;

public class Twins {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Integer [] value = new Integer[n];
        int sCoin =0 , bCoin =0, minCoin, taken =0;



        for(int i =0 ; i<n; i++) {
            value[i] =input.nextInt();
            sCoin+= value[i];
        }
        minCoin = sCoin /2;
        Arrays.sort(value,Collections.reverseOrder());
        for(int v : value)
        {
            if(bCoin <= minCoin)
            {
                bCoin+=v;
                taken++;
            }
        }
        System.out.println(taken);
    }
}
