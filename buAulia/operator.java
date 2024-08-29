import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        String nama;
        Boolean status; 
        int Jumlah= input.nextInt();
        String obj="*";
        for(int i=0; i<=Jumlah; i++ ){
            for(int k=1;k<Jumlah/2;k++){
                for(int j=Jumlah;j>i;j--){
                    System.out.print(" ");
                }
            }
            for(int j=0;j<i;j++){
                System.out.print(obj);
            }
            for(int j=1;j<i;j++){
                System.out.print(obj);
            }
            System.out.println(" ");
        };


        nama="al";
        a=5;
        c=a%3;
        b=a*c/1;
        d=10;






    }
}
