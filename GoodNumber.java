// https://codeforces.com/contest/365/problem/A

import java.util.*;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() , k = input.nextInt();
        input.nextLine();
        int counter = 0;
        for(int i =0 ;i < n;i++)
        {
            boolean good = false;
            String tmp = input.nextLine();
            for(int j =0;j<=k;j++)
            {
                if(tmp.contains(String.valueOf(j)))
                    good = true;
                else {
                    good = false;
                    break;
                }

            }
            if(good) counter++;
        }
        System.out.println(counter);
    }
}
