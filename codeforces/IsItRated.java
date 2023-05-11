//http://codeforces.com/contest/807/problem/A

import java.util.*;

public class IsItRated {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int[] before = new int[n];
        int[] after = new int[n];

        for(int i =0 ; i<n ;i++)
        {
            before[i] =input.nextInt();
            after[i] =input.nextInt();

            if(after[i] -before[i] !=0)
            {
                System.out.println("rated");
                return;
            }
        }

        for(int i=0 ;i<n-1;i++)
        {
            if(before[i] < before[i+1] )
            {
                System.out.println("unrated");
                return;
            }

        }
        System.out.println("maybe\n");
    }
}
