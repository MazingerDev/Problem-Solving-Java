//http://codeforces.com/contest/799/problem/A

import java.util.Scanner;

public class CarrotCakes {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //number of cakes
        int t = input.nextInt(); //time to prepare k cake
        int k = input.nextInt(); //the number of cake bake at the same time
        int d = input.nextInt(); //time to build the second oven
        int t1 ;

        if(n%k == 0) // assume that n = k*c , then total time = (n/k) *t
            t1 = (n/k) *t;
        else t1 = (n/k+1) *t;

        int t2 =d+t; // time with two oven (time to build the oven +time to prepare k cake)
        if(t2<t1)
            System.out.println("YES");
        else System.out.println("NO");


    }


}
