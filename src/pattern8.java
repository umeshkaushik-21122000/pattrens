import java.util.Scanner;

public class pattern8 {

    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
        int innerspace=0;
        int outerspace=a-1;
        for(int line=1;line<=a;line++){
            for(int i=1;i<=innerspace;i++){
                System.out.print("\t");
            }
            System.out.print("*");
            for(int i=1;i<=outerspace;i++){
                System.out.print("\t");
            }
            if(outerspace!=0){
                System.out.print("*");

            }
         if(line<=a/2){
             outerspace-=2;
             innerspace++;
         }
            else{
                outerspace+=2;
                innerspace--;
         }

            System.out.println(); }


        }
    }

