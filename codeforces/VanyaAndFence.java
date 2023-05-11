
//https://codeforces.com/contest/677/problem/A

import java.util.Scanner;

public class VanyaAndFence {

    public static  void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int h = input.nextInt();
        int[] a = new int[n];
        int vw=0;

        for(int i =0 ; i<n; i++)
        {
            a[i]= input.nextInt();
        }

        for(int person : a)
        {
            if (person> h)
            {
                vw += 2;
            }
            else
                vw +=1;;
        }

        System.out.println(vw);


    }



}
