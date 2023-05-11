//http://codeforces.com/contest/344/problem/A

import java.util.Scanner;

public class Magnets {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        int[] m = new int[n];
        int c =0;
        for(int i =0 ; i< n;i++)
            m[i] = input.nextInt();

        for (int i =0 ; i< n-1 ;i++)
        {
            if(m[i] != m[i+1])
                c++;
        }

        System.out.println(c+1);
    }

}
