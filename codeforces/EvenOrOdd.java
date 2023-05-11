//http://codeforces.com/contest/318/problem/A

import java.util.*;

public class EvenOrOdd {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long k = input.nextLong();
        long  odds, evens, res;

        if (n % 2 == 0) {

            odds = evens = n / 2;
        } else {
            odds = (n / 2) + 1;
            evens = n - odds;
        }

        if (k <= odds) {

            res = (k * 2) - 1;
        } else {

            res = (k - odds) * 2;
        }

        System.out.println(res);
    }
}
