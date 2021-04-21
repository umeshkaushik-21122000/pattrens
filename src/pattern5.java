import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a =my.nextInt();
        int sp=1;
        int lst=(a/2)+1;
        int rst=lst;
        for(int line=1;line<=a;line++){
            for(int k=1;k<=lst;k++){
                System.out.print("*\t");
            }
            for(int k=1;k<=sp;k++){
                System.out.print("\t");
            }
            for(int k=1;k<=rst;k++){
                System.out.print("*\t");
            }

            if(line<=(a/2)){
               sp+=2;
               lst--;
               rst--;
           }
            else{

               sp-=2;
               lst++;
               rst++;
           }

            System.out.println();
        }
    }
}
