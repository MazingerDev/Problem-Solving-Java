//http://codeforces.com/contest/686/problem/A
import java.util.*;

public class FreeIceCream {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // kids in queue
        long x = input.nextInt(); // packs
        char c ; // '+' or '-'
        int d ; // ice cream demand or supplies
        int dis = 0; //distressed kids
        for(int i =0 ;i<n; i++)
        {
            c = input.next().charAt(0);
            d = input.nextInt();

            if(c == '+') // add packs
                x+=d;

            else if(c =='-' && d <= x) // remove packs if inventory covers demand
                x-=d;
            else dis ++;

        }

        System.out.println(x +" " + dis); //output

    }
}
