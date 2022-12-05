//https://codeforces.com/contest/768/problem/A

import java.util.*;

public class OathOfTheNightsWatch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long a[] = new long[n];
        int c =0;


        for(int i =0 ; i<n ;i++)
            a[i] = input.nextLong();


        long m =Arrays.stream(a).max().getAsLong();
        long s =Arrays.stream(a).min().getAsLong();

        for(int i =0 ; i<n ;i++)
        {
            if(a[i] > s && a[i] <m)
                c++;
        }
        System.out.println(c);

    }
}
