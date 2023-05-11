
//http://codeforces.com/contest/381/problem/A

import java.util.Scanner;

public class SerejaAndDima {

    public  static void  main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cards[] = new int[n];
        int s =0 , d =0;
        int turn =1;

        for(int i =0 ; i<n ;i++)
            cards[i] =input.nextInt();

        int j = n-1 ;
        int i =0;
        while (turn <= n)
        {
            if(turn %2 ==1)
            {
                if (cards[i] >= cards[j])
                {
                    s += cards[i];
                    i ++;
                }
                else
                {
                    s+= cards[j] ;
                    j--;
                }
            }

            if( turn %2 ==0)
            {
                if (cards[i] >= cards[j])
                {
                    d += cards[i];
                    i ++;
                }
                else
                {
                    d+= cards[j] ;
                    j--;
                }
            }
            turn ++;
        }


        System.out.println(s +" " +d);


    }
}
