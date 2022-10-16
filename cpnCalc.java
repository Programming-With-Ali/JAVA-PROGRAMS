import java.util.*;

class cpnCalc {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        double Matric, Inter, EntryMarks;
        double CPNRESULT;
        System.out.println("Your Matric Marks: ");
        Matric = o.nextDouble();
        Matric = Matric / 850 * 100;
        System.out.println("Your Inter Marks: ");
        Inter = o.nextDouble();
        Inter = Inter / 1100 * 100;
        System.out.println("Your Entry-Test Marks: ");
        EntryMarks = o.nextDouble();
        EntryMarks = EntryMarks / 100 * 100;
        CPNRESULT = (Matric / 100) * 10 + (Inter / 100) * 30 + (EntryMarks / 100) * 60;
        System.out.println("Your CPN: " + CPNRESULT);
    }
}
