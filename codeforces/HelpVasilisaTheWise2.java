// https://codeforces.com/contest/143/problem/A

import java.util.*;

public class HelpVasilisaTheWise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int c1 = input.nextInt();
        int c2 = input.nextInt();
        int d1 = input.nextInt();
        int d2 = input.nextInt();

        int i11 = (r1+c1 -d2) /2;
        int i12 = r1 -i11;
        int i21 = c1 - i11;
        int i22 = d1 - i11;

        if(i11 != i12 && i11 != i21 && i11 != i22 && i12 != i21 && i12 != i22 && i21 != i22
                && i11 >= 1 && i11 <= 9
                && i12 >= 1 && i12 <= 9
                && i21 >= 1 && i21 <= 9
                && i22 >= 1 && i22 <= 9
                && i21 + i22 == r2
                && i12 + i22 == c2
                && i12 + i21 == d2)
        {
            System.out.println(i11 + " " + i12 +"\n" + i21 +" " + i22);
        }
        else System.out.println(-1);

    }
}
