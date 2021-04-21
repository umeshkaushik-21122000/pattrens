import java.util.Scanner;

public class pattern3{
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int input= my.nextInt();
        int sp=1;
        int st=input+2;
        for(int line=1;line<=st;line++){
            for(int l=1;l<=input;l++){
                System.out.print("*\t");
            }for(int k=1;k<=sp;k++){
                System.out.print("\t");
            }

            if(line<=input/2){
                sp+=2;
                st-=2;

            }
            else{
                sp-=2;
                st+=2;


            }

            System.out.println();

        }
    }



}