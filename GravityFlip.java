//http://codeforces.com/contest/405/problem/A

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int [] cups = new int[c];

        for(int i =0 ; i<c; i++)
            cups[i]= input.nextInt();

        Arrays.sort(cups);

        for(int a: cups)
            System.out.print(a + " ");
    }
}
