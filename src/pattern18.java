import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
        int star=a;
        int outerspace=0;

        for(int line=1;line<=a;line++){
            for(int i=1;i<=outerspace;i++){
                System.out.print("\t");
            }
            for(int i=1;i<=star;i++){
                if(line>1&&line<=a/2&&i>1&&i<star){
                    System.out.print("\t");
                }
                else{System.out.print("*\t");}
            }

            if(line<=a/2){
                star-=2;
                outerspace++;
            }
            else{
                star+=2;
                outerspace--;

            }
            System.out.println();
        }

    }
}
