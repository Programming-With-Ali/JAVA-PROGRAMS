import java.util.*;

class ArithematicOpt {
    public static void main(String[] arg) {
        Scanner obj = new Scanner(System.in);
        float n1, n2;

        System.out.println("First No:>");
        n2 = obj.nextFloat();

        System.out.println("Second Number:> ");
        n1 = obj.nextFloat();

        System.out.println("!(n == n2)  " + !(n1 == n2));

        System.out.println("n + n2  " + (n1 + n2));
        System.out.println("n - n2  " + (n1 - n2));
        System.out.println("n / n2  " + (n1 / n2));
        System.out.println("n % n2  " + (n1 % n2));

        n1++;
        ++n1;

        n1--;
        --n2;

        System.out.println("n == n2  " + (n1 == n2));
        System.out.println("n <= n2  " + (n1 <= n2));
        System.out.println("n >= n2  " + (n1 >= n2));
        System.out.println("n != n2  " + (n1 != n2));

        System.out.println("!(n == n2)  " + !(n1 == n2));

        System.out.println("(n1 == n2 && n1 == n2) " + (n1 == n2 && n1 == n2));
        System.out.println("(n1 == n2 || n1 == n2) " + (n1 != n2 || n1 == n2));
    }
}