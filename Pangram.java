//http://codeforces.com/contest/520/problem/A

import java.util.*;

public class Pangram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String s = input.nextLine().toLowerCase();
        char begin  = 97;


        if(n < 26)
        {
            System.out.println("NO");
            return;
        }

        while(begin < (char) 123)
        {
            if(!s.contains(String.valueOf(begin)))
            {
                System.out.println("NO");
                return;
            }
            begin++;

        }
        System.out.println("YES");

    }
}
