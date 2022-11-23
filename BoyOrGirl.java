
//http://codeforces.com/contest/236/problem/A

import java.util.Scanner;

public class BoyOrGirl {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String temp ="";
        for(int i=0 ; i< name.length(); i++)
        {
            if (!temp.contains(String.valueOf(name.charAt(i))))
            {
                temp += name.charAt(i);
            }


        }



        if(temp.length() % 2 ==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
            System.out.println("IGNORE HIM!");
    }
}
