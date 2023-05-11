//http://codeforces.com/contest/268/problem/A

import java.util.Scanner;

public class Games {
    public  static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int c = 0;
        int n  = input.nextInt();
        int[][] color = new int[n][2];

        for(int i = 0; i < n; i++)
            for(int j =0; j <2 ; j++)
                color[i][j] = input.nextInt();


        for (int i =0; i <n ;i++)
        {
            int tmp = color[i][0];
            for(int j= 0 ; j<n ; j++)
            {
                if(i !=j)
                {
                    if(tmp == color[j][1])
                        c ++;
                }
            }
        }

        System.out.println(c);
    }



}
