// https://codeforces.com/contest/225/problem/A

import java.util.*;

public class DiceTower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() ,x = input.nextInt();

        for(int i =0; i< n; i++)
        {
            int a = input.nextInt() , b = input.nextInt();
            if(x == a || x == 7-a || x == b || x == 7-b)
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
