//http://codeforces.com/contest/43/problem/A

import java.util.*;

public class Football {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        input.nextLine();
        int teamScore[] = new int[2];
        String teams[] = new String[2];

        for(int i =0 ;i<n;i++)
        {
            String name = input.nextLine();
            if(i ==0)
            {
                teams[0] = name;
                teamScore[0]++;
            }
            else
            {
                if(!name.equals(teams[0]))
                {
                    teams[1] = name;
                    teamScore[1]++;
                }
                else teamScore[0]++;
            }
        }

        if(teamScore[0]> teamScore[1]) System.out.println(teams[0]);
        else System.out.println(teams[1]);
    }
}
