//

import java.util.*;

public class HelpfulMaths {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine(); // input string
        String f = ""; // output variable

        String[] a =  s.split("\\+"); // split into array


        //sorting
        for (int i =0;i<a.length;i++)
        {
            for(int j = i+1; j<a.length; j++) {
                String tmp;
                if (Integer.parseInt(a[i]) > Integer.parseInt(a[j])) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

         //output
        f+= a[0];
        for (int i =1;i<a.length;i++)
            f+= "+" + a[i];

        System.out.println(f);


    }
}
