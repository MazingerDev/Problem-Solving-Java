// https://codeforces.com/contest/785/problem/A

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        Map<String,Integer> polyhedrons = new HashMap<>(){{
            put("Tetrahedron",4);
            put("Cube",6);
            put("Octahedron",8);
            put("Dodecahedron",12);
            put("Icosahedron",20);
        }};
        Integer sum = 0;

        while (n!=0)
        {
            String tmp = input.nextLine();
            sum+= polyhedrons.get(tmp);
            n--;
        }
        System.out.println(sum);
    }

}
