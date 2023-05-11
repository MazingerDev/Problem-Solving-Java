// https://codeforces.com/contest/80/problem/A

import java.util.*;

public class PanoramixsPrediction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        if(!isPrime(m)) {
            System.out.println("NO");
            return;
        }
        else {
            for(int i = n+1; i<m;i++)
            {
                if(isPrime(i))
                {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");

    }

    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
}
