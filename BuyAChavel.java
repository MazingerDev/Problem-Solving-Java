
//http://codeforces.com/contest/732/problem/A

import java.util.Scanner;

public class BuyAChavel {


     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         int k = input.nextInt();
         int r =input.nextInt();
         int d = (k % 10 );
         int c =0;
         int t =0;

         if(r != d )
         {
             while (d != r)
             {
                 t += k;
                 d = (t % 10);
                 c++;
                 if (d == 0) break;
             }
         }
         else c = 1;


         System.out.println(c);

     }

}
