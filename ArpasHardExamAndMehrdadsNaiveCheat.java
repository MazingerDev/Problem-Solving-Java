//http://codeforces.com/contest/742/problem/A

import java.util.Scanner;

public class ArpasHardExamAndMehrdadsNaiveCheat {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if(n ==0) System.out.println(1);
        else
        {
            if(n%4 ==0) System.out.println(6);
            else if((n+1)%4 ==0) System.out.println(2);
            else if(n%2 ==0) System.out.println(4);
            else System.out.println(8);
        }

        /*
        * 1378 we use last digit "8"
        * 8 power 1 >> 8
        * 8 power 2 >> 4
        * 8 power 3 >> 2
        * 8 power 4 >> 6
        * 8 power 5 >> 8
        * */

    }
}
