//http://codeforces.com/contest/112/problem/A


import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine().toLowerCase();
        String s2 = input.nextLine().toLowerCase();
        int out = 0;
        for(int i =0 ; i<s1.length(); i++)
        {
            if (s1.charAt(i) < s2.charAt(i))
            {
                out = -1;
                break;
            }

        if (s1.charAt(i) > s2.charAt(i))
            {
                out = 1;
                break;
            }
        }

        System.out.println( out);

    }

}
