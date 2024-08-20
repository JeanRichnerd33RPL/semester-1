import java.util.Scanner;

public class hargaBarang {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("inputkan harga awal : ");
            int hargaAwal= input.nextInt();

            System.out.println("inputkan diskon yang didapat");
            int persentaseDiskon=input.nextInt();

            System.out.println("input jumlah barang yang dibeli");
            int jumlahDibeli = input.nextInt();

            double diskon=hargaAwal*jumlahDibeli*persentaseDiskon/100;
            double total=(hargaAwal*jumlahDibeli) - (diskon);
            
            System.out.println("harga yang harus dibayar adalah RP. "+total);
        }
    }
}
