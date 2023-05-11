//http://codeforces.com/contest/404/problem/A
import java.util.*;

public class ValeraAndX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

       Set<Character> c1 = new HashSet<>();
       Set<Character> c2 = new HashSet<>();
        input.nextLine();

        for(int i =0 ;i <n ;i++)
        {
            String line = input.nextLine();
            for(int j =0; j<n ;j++)
            {
                if(i  == j || i+j == n-1)
                    c1.add(line.charAt(j));
                else
                    c2.add(line.charAt(j));
            }
        }

        if(c1.size() == 1 && c2.size() ==1 && !c1.equals(c2))
            System.out.println("YES");
        else System.out.println("NO");




    }
}
