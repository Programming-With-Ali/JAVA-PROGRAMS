
import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter A Number: ");
        int num = read.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}