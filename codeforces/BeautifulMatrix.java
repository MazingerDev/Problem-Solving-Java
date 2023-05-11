//https://codeforces.com/contest/263/problem/A

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [][] m =new int[5][5];
        int x =0,y =0;
        int move =0;

        for(int i =0; i<5; i++)
        {
            for(int j =0; j<5;j++)
            {
                m[i][j] = input.nextInt();
                if(m[i][j] == 1)
                {
                    x =i;
                    y =j;
                }
            }
        }

        while( x != 2 || y !=2)
        {
            if(x > 2)
            {
                x--;
                move++;
            }
            if(x < 2)
            {
                x++;
                move++;
            }
            if(y < 2)
            {
                y++;
                move++;
            }
            if(y > 2)
            {
                y--;
                move++;
            }

        }
        System.out.println(move);


    }
}
