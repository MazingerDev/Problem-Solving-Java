   //http://codeforces.com/contest/294/problem/A

    import java.util.Scanner;

    public class ShaassAndOskols {

        public static void main (String[] args)
        {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int[] a = new int[n];

            for(int i = 0; i<n ; i++)
                a[i]  = input.nextInt(); //bird per wire

            int m =input.nextInt();

            for(int i =0 ;i<m ; i++)
            {
                int x = input.nextInt(); //shot
                int y = input.nextInt(); // bird position
                int tmp = a[x-1]; // bird number in shot position
                a[x-1] =0; // all bird in shot position fly
                if(x != n) // if there was a higher wire
                    a[x] += tmp -y; // bird on the left
                if(x != 1) // if there was a lower wire
                    a[x-2] +=y-1; // bird in the right

            }

            for(int i =0 ;i<a.length ; i++)
                System.out.println(a[i]);




        }


    }
