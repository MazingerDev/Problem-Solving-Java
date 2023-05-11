//http://codeforces.com/contest/208/problem/A

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String s1 = s.replaceAll("WUB", " ");

        System.out.println(s1.trim());


    }


}
