//http://codeforces.com/contest/731/problem/A

import java.util.Scanner;

public class NightAtTheMuseum {

    public  static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char pointer ='a';
        String s = input.nextLine();
        int rotations = 0;

        for(int i =0 ; i < s.length(); i++)
        {
            char tmp = s.charAt(i);
            if( (int) pointer < (int) tmp)
            {
                if( (int) tmp - (int) pointer < 26- ((int) tmp - (int) pointer)  )
                    rotations += (int) tmp - (int) pointer;
                else rotations += 26- ((int) tmp - (int) pointer) ;
            }
            else
            {
                if((int) pointer - (int) tmp > 26- ((int) pointer - (int) tmp)  )
                    rotations += 26- ((int) pointer - (int) tmp) ;
                else rotations += ((int) pointer - (int) tmp) ;
            }
            pointer =tmp;
        }

        System.out.println(rotations);

    }


}
