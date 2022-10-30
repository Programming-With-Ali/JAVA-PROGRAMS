import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n1: Addition");
        System.out.println("\n2: Subtraction");
        System.out.println("\n3: Multiplication");
        System.out.println("\n4: Division");
        int ch = in.nextInt();

        System.out.println("\nEnter First NUm: ");
        double num = in.nextDouble();

        System.out.println("\nEnter Second NUm: ");
        double num2 = in.nextDouble();

        System.out.println("\n\nResult: ");
        switch (ch) {
            case 1:

                System.out.println(num + num2);
                break;
            case 2:
                System.out.println(num - num2);

                break;
            case 3:
                System.out.println(num * num2);

                break;
            case 4:
                System.out.println(num / num2);

                break;

            default:
                System.out.println("Invalid CHoice");
        }
    }

}
