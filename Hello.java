import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();

        System.out.println(s);

        for (char c: s) {
            System.out.println(c + " ");
        }

        // Stuff s = new Stuff();
        // s.doubleIt(3);

        // Stuff s1 = new Stuff();
        // s1.doubleIt(4);

        // System.out.println("S has " + s.y + " and S1 has " + s1.y);
        // System.out.println("The static method has " + Stuff.foo());
    }
}
