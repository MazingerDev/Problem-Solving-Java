
// https://codeforces.com/contest/734/problem/A

import java.util.Scanner;

public class AntonAndDanik
{
    public  static  void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int playno = input.nextInt();
        input.nextLine();
        String log = input.nextLine();
        int counter =0;

        for(int i=0; i<log.length();i++)
        {

            if(log.charAt(i) =='A')
                counter++;

            if(log.charAt(i) == 'D')
                counter--;
        }

        if(counter >= 1)
            System.out.println("Anton");
        else if(counter<1 && counter != 0)
            System.out.println("Danik");
        else
            System.out.println("Friendship");



    }
}
