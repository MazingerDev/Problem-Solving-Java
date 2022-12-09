//http://codeforces.com/contest/469/problem/A

import java.util.*;

public class IWannaBeTheGuy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean[] lvls = new boolean[n];

        int p = input.nextInt();
        for(int i=0 ; i<p;i++)
        {
            int lvl = input.nextInt();
            lvls[lvl-1] = true;
        }

        int q = input.nextInt();
        for(int i =0 ;i<q;i++)
        {
            int lvl = input.nextInt();
            lvls[lvl-1] = true;
        }

        for(boolean a : lvls)
        {
            if(!a)
            {
                System.out.println("Oh, my keyboard!\n");
                return;
            }
        }
        System.out.println("I become the guy.\n");

    }
}
