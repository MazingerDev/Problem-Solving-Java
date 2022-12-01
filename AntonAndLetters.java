//http://codeforces.com/contest/443/problem/A

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AntonAndLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine(); // input string
        Map<Character,Integer> m = new HashMap<>(); // hashmap to check if letter does not repeat
        int c =0; // counter letter

        for(int i =0; i<s.length();i ++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') // ignore curvy bracket and comas
            {
                if(m.get(s.charAt(i)) == null) // check if letter do not exist in map
                {
                    c++;
                    m.put(s.charAt(i),i); // put new letter in map
                }
            }

        }
        System.out.println(c); // output

    }



}
