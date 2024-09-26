
import java.util.Scanner;

public class soal {
    public static void main(String[] args) {
        int temp=0;
        try (Scanner in = new Scanner(System.in)) {
            String credential="yes";
            System.out.print("masukkan jumlah siswa : ");
            int jumlahSiswa=in.nextInt();
            for(int i=0; i<jumlahSiswa;i++){
                System.out.print("masukkan nilai siswa ke " + (i+1) + " ");
                int listNilai=in.nextInt();
                temp +=listNilai;
            }
            temp /=jumlahSiswa;
            System.out.println("Nilai rata rata : " + temp);
            
        }
        
    }
}
