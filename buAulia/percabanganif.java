import java.util.Scanner;

public class percabanganif {
    public static void main(String[] args) {
        double angka;
        String nama;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("masukkan nama : ");
            nama=input.nextLine();
            System.out.println(" ");
            System.out.print("masukkan total pembelian :");
            angka=input.nextDouble();
        }
        if (angka>=50000) {
            System.out.println("dapat diskon");
        } else if(angka <= 50000 && angka>=20000){
            System.out.println("terima kasih sudah membeli");
        } else{
            System.out.println("minimal gak miskin");
        }
        switch (nama) {
            case "ardian":
                System.out.println("komando latian pertempuran");
                break;
        
            default:
                System.out.println("selamat jalan");
                break;
        }

    }
}
