// https://codeforces.com/contest/483/problem/A

import java.util.*;

public class Counterexample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long l = input.nextLong();
        long r = input.nextLong();

        if(l%2!=0)
            l++;
        if(Math.abs(l-r)<2)
            System.out.println("-1");
        else
            System.out.println(l+" "+(l+1)+" "+(l+2));

    }
}
