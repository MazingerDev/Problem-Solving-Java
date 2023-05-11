//http://codeforces.com/problemset/problem/767/A

import java.util.*;

public class Snacktower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[]snack=new int[n+1];
        for (int i = 1; i <= n; i++) {
            snack[i]=input.nextInt();
        }
        boolean[]v=new boolean[n+1];

        int c=n;
        for (int i = 1; i <=n; i++) {
            v[snack[i]]=true;

            while(v[c]&&c>0)
                System.out.print(c-- +" ");
            System.out.println("");
        }



    }
}
