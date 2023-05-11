//https://codeforces.com/contest/791/problem/A

import java.util.Scanner;

public class BearAndBigBrother {

    public  static  void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int l = input.nextInt();
        int b = input.nextInt();
        int years =0;

        while (l<=b)
        {
            l = l *3;
            b = b *2;
            years++ ;
        }

        System.out.println(years);
    }



}
