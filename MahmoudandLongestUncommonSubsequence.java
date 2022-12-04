//https://codeforces.com/contest/766/problem/A

import java.util.*;

public class MahmoudandLongestUncommonSubsequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a  =input.nextLine();
        String b  =input.nextLine();

        if(a.equals(b))
            System.out.println(-1);
        else
            System.out.println(Math.max(a.length(),b.length()));


    }
}
