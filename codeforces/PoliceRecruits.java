//http://codeforces.com/contest/431/problem/A

import java.util.Scanner;

public class PoliceRecruits {

    public  static  void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int hired =0 ;
        int untreated = 0;
        int[] events = new int[n];

        for (int i = 0 ; i<n ; i++) {
            events[i] = input.nextInt();
            if(events[i] > 0) {
                hired += events[i];
                continue;
            }


            if(events[i] == -1 && hired > 0)
                hired--;

            else untreated ++;

        }

        System.out.println(untreated);


    }


}
