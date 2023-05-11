//http://codeforces.com/contest/9/problem/A

import java.util.Scanner;

public class DieRoll {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        int w = input.nextInt();
        int a = 7 - Math.max(y, w);
        int b = 6;
        if (b % a == 0) {

            b /= a;
            a /= a;
        } else if (a % 2 == 0 && b % 2 == 0) {

            a /= 2;
            b /= 2;
        }


        System.out.println(a + "/" + b);
    }
}




