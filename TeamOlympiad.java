//http://codeforces.com/contest/490/problem/A

import java.util.*;

public class TeamOlympiad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        ArrayList<Integer> t3 = new ArrayList<>();
        int w = 0;

        for(int i =0; i<n;i++)
        {
            int a = input.nextInt();
            if(a ==1)
                t1.add(i+1);
            if(a ==2)
                t2.add(i+1);
            if(a ==3)
                t3.add(i+1);

        }

        w= Math.min(Math.min(t1.size(),t2.size()),t3.size());
        if(!t1.isEmpty() && !t2.isEmpty() &&!t3.isEmpty())
        {
            System.out.println(w);
            for(int i =0 ; i<w; i++)
                System.out.println(t1.get(i) +" "+ t2.get(i) +" "+ t3.get(i));
        }
        else System.out.println(0);
    }
}
