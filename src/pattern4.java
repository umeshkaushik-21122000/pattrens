import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        int outerspace = a / 2;
        int innerspace = -1;
        for (int line = 1; line <= a; line++) {
            for (int k = 1; k <=outerspace; k++) {                  //outer spaces loop
                System.out.print("\t");
            }
            System.out.print("*");
            for (int l =0; l <= innerspace; l++) {                    //inner spaces loop
                System.out.print("\t");
            }
            if (line > 1 && line < a) {
                System.out.print("*\t");
            }

            if (line <= (outerspace / 2)+1) {
                outerspace--;
                innerspace += 2;

            } else {
                outerspace++;
                innerspace -= 2;

            }

            System.out.println();
        }
    }
}
