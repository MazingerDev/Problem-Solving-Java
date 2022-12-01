//http://codeforces.com/contest/71/problem/A

import java.util.*;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //number of words
        input.nextLine();
        String s ;
        String[] abb = new String[n]; // output abbreviation  list

        for(int i =0 ; i<n; i++)
        {
            s =input.nextLine(); // word input
            if(s.length() > 10) // check if word size more than 10
                abb[i] = s.charAt(0) + String.valueOf(s.length() -2) +s.charAt(s.length()-1); // abbreviation formula
            else abb[i] =s ;
        }

        for(String value : abb)
            System.out.println(value); // display output

    }

}
