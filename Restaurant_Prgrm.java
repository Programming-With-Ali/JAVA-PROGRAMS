import java.util.*;

class Restaurant_Prgrm {
    public static void main(String[] args) {
        int i;

        Scanner o = new Scanner(System.in);

        String Foods[][] = {

                { "Pizza", "344" },
                { "Pasta", "343" },
                { "Zinger-Burger", "250" },
                { "Chicken-Sticks", "343" },
                { "Club-SandWitch", "340" }
        };
        // o.nextDouble();
        // String Foodss[] = {"thtthtu", "huethutaou"};
        while (true) {
            for (i = 0; i < Foods.length; i++) {
                System.out.println((i + 1) + " " + Foods[i][0]);
            }

            int ch = o.nextInt();
            // boolean isfound = false;

            // for(i=0;i< Food.length;i++){
            // if(ch-1 == Foods[i]){
            // isfound = true;
            // break;
            // }
            // }
            // if(isfound ){
            // System.out.println("\n\n"+ "Food Item: " + Foods[i][0] + " " + Foods[i][1] +
            // "Rs");

            // }

            switch (ch) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("\n\n" + "Food Item: " + Foods[ch - 1][0] + "  " + Foods[ch - 1][1] + "Rs\n\n");
                    break;
                case 2:
                    System.out.println("\n\n" + "Food Item: " + Foods[ch - 1][0] + "  " + Foods[ch - 1][1] + "Rs\n\n");
                    break;
                case 3:
                    System.out.println("\n\n" + "Food Item: " + Foods[ch - 1][0] + "  " + Foods[ch - 1][1] + "Rs\n\n");
                    break;
                case 4:
                    System.out.println("\n\n" + "Food Item: " + Foods[ch - 1][0] + "  " + Foods[ch - 1][1] + "Rs\n\n");
                    break;
                case 5:
                    System.out.println("\n\n" + "Food Item: " + Foods[ch - 1][0] + "  " + Foods[ch - 1][1] + "Rs\n\n");
                    break;
                default:
                    System.out.println("\n\n\n\nKindly Enter Correct Information\n\n");
            }
        }
    }
}
