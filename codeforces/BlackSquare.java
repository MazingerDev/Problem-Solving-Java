//http://codeforces.com/contest/431/problem/A

import java.util.Scanner;

public class BlackSquare {

    public  static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        int a4 = input.nextInt();
        int calories = 0;


        input.nextLine();

        String second = input.nextLine();

        for ( int i =0 ; i< second.length(); i++)
        {
            if ( second.charAt(i) == '1')
                calories += a1;
            else if ( second.charAt(i) == '2')
                calories += a2;
            else if(second.charAt(i) == '3')
                calories += a3;
            else calories+= a4;
        }

        System.out.println(calories);
    }

}
