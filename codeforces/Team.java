//https://codeforces.com/contest/231/problem/A

import java.util.Scanner;

public class Team {

    public  static  void main(String[] args)
    {
        Scanner input =new Scanner(System.in);

        int pn = input.nextInt();
        int[][] a= new  int[pn][3];
        int p=0;

        for(int i =0; i<pn; i++)
        {
            for(int j =0; j<3;j++)
                a[i][j] = input.nextInt();
        }

        for(int t[] : a)
        {
            if (t[0] + t[2] + t[1] >= 2)
                p++ ;

        }

        System.out.println(p);




    }


}


