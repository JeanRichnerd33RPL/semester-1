import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Jumlah= input.nextInt();
        String obj="*";
        for(int i=0; i<Jumlah; i++ ){
            for(int k=Jumlah-1;k>i;k--){
                System.out.print(" ");
                // for(int j=0;j<i;j++){
                // }
            }
            for(int j=0;j<i+1;j++){
                System.out.print(obj);
            }
            for(int j=1;j<i;j++){
                System.out.print(obj);
            }
            System.out.println(" ");
        };







    }
}
