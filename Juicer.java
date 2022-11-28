// http://codeforces.com/contest/709/problem/A

import java.util.Scanner;

public class Juicer {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); //number of orange
        int b = input.nextInt(); // maximum size of orange
        int d =input.nextInt() ; // capacity of wast section
        int w = 0 ; // number of times kolya empty the wast section
        int cw = 0 ; //current wast in wast section

        for(int i =0 ;i <n ;i++)
        {
            int a = input.nextInt(); // size of orange

            if(a <= b)  //if the size of orange less than or equal maximum orange size
                cw +=a; // add orange size in current wast section
            if(cw > d) // if current wast section greater than maximum capacity of wast section(overflow)
            {
                cw =0 ; // empty wast section
                w++; // increase empty wast times
            }
        }

        System.out.println(w);

    }
}
