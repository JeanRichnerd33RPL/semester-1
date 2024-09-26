
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("masukkan jumlah : ");
            int jumlahAngka=in.nextInt();
            int tempt=1;
            for(int i=1; i<=jumlahAngka;i++){
                tempt *=i;
            }
            System.out.println("factorial dari " + jumlahAngka+ " adalah " +tempt);
            
        }
    }
    
}
