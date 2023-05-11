//http://codeforces.com/contest/770/problem/A

import java.util.*;

public class NewPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        String pass = "";

        for (int i = 0, j = 0; i < n; i++) {
            pass = pass + (char)('a' + j);
            if (j + 1 < k)
                j++;
            else
                j = 0;
        }
        System.out.println(pass);

    }
}
