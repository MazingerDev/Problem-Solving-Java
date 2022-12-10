//http://codeforces.com/contest/707/problem/A

import java.util.*;

public class BrainsPhotos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n =input.nextInt();
        int m =input.nextInt();

        for(int i =0 ; i< n*m;i++)
        {
            char p = input.next().charAt(0);
            if(p == 'C' || p == 'M'|| p == 'Y')
            {
                System.out.println("#Color");
                return;
            }
        }

        System.out.println("#Black&White");
    }
}
