//http://codeforces.com/contest/1/problem/A

import java.util.*;

public class TheatreSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long m,n,a;
        m = input.nextLong();
        n = input.nextLong();
        a = input.nextLong();
        System.out.println((long)(Math.ceil((double)m/a)*Math.ceil((double)n/a)));
    }
}
