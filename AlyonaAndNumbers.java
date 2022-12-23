// https://codeforces.com/contest/682/problem/A

import java.util.*;

public class AlyonaAndNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong() , m =input.nextLong();
        long c= 0 ;
        for(int i =1 ; i<=n ;i++)
        {
            c+= (m+(i%5))/5;
        }
        System.out.println(c);

    }
}
