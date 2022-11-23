//http://codeforces.com/contest/59/problem/A

import java.util.Scanner;

public class Word {

    public static void  main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        String s = input.nextLine();
        int c = 0;

        for (int i = 0 ; i< s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i))) c++;
        }

        if(c > (s.length() /2))
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }

}
