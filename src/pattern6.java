import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();

        int innerspace=0;
        for(int line=1;line<=a;line++){
            for(int k=1;k<=innerspace;k++){
                System.out.print("\t");
            }
            System.out.print("*");
            innerspace++;
            System.out.println();

        }
    }
}
