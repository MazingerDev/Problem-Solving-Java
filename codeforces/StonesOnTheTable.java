
//https://codeforces.com/contest/266/problem/A

import java.util.Scanner;

public class StonesOnTheTable {

    public static void  main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String color = input.nextLine();
        int c =0 ;

        for (int i =0 ;i< n-1; i++)
        {
            if (color.charAt(i) == color.charAt(i+1))
                c++;
        }
        System.out.println(c);
    }
}
