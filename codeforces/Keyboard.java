//http://codeforces.com/contest/474/problem/A

import java.util.*;

public class Keyboard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char dir = input.nextLine().toLowerCase().charAt(0);
        String s= input.nextLine();
        String message= "";
        String keyMap ="qwertyuiopasdfghjkl;zxcvbnm,./";

        for (int i =0 ; i< s.length();i++)
        {
            if(dir == 'r')
            {
                if(s.charAt(i) == 'q' || s.charAt(i) == 'a' ||s.charAt(i) == 'z')
                    message += s.charAt(i);
                else message += keyMap.charAt(keyMap.indexOf(s.charAt(i))-1);
            }
            if(dir == 'l')
            {
                if(s.charAt(i) == ';' || s.charAt(i) == 'p' ||s.charAt(i) == '/')
                    message += s.charAt(i);
                else message += keyMap.charAt(keyMap.indexOf(s.charAt(i))+1);
            }
        }
        System.out.println(message);



    }
}
