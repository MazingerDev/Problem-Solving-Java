//http://codeforces.com/contest/228/problem/A

import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {

    public static void main(String[] ags)
    {
        Scanner input = new Scanner(System.in);
        int[] s = new int[4];
        int n =0;

        for(int i =0 ; i<4; i++)
        {
            s[i] = input.nextInt();

            for(int j =0 ;j <4 ;j ++)
            {
                if( i != j && s[i] == s[j]) {
                    n++;
                    break;
                }
            }
        }

        System.out.println(n);

    }


}
