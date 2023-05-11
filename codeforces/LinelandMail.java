//http://codeforces.com/contest/567/problem/A

import java.util.*;

public class LinelandMail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] x = new int[n];
        int min,max;
        for(int i=0 ;i <n ; i++)
            x[i] = input.nextInt();

        for(int i =0 ;i<n ;i++)
        {
            if(i != 0 && i!= n-1)
            {
                min = ((x[i] -x[i-1]) < (x[i+1] - x[i])) ? (x[i] -x[i-1]) : (x[i+1] - x[i]);
                max = ((x[i] -x[0]) < (x[n-1] - x[i])) ? (x[n-1] - x[i]) : (x[i] -x[0]);

                System.out.println(min + " " +max);
            }
            else
            {
                min = (i == 0) ? x[i+1] -x[0] : x[n-1] - x[n-2];
                max = x[n-1] - x[0];
                System.out.println(min + " " +max);

            }
        }



    }
}
