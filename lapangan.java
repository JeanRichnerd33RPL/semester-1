import java.util.Scanner;

public class lapangan {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("masukkan tipe bangun: ");
        String bangunDatar=input.next();
        if (bangunDatar.equals("persegiPanjang")) {
            System.out.println("panjang :");
            int panjang=input.nextInt();
            System.out.println("lebar :");
            int  lebar=input.nextInt();
            int hasil= panjang*lebar;
            System.out.println("Luas Lapangan : "+hasil);
        } else if (bangunDatar.equals("segitiga")) {
            System.out.println("tinggi :");
            int tinggi=input.nextInt();
            System.out.println("alas :");
            int  alas=input.nextInt();
            int hasil= 1/2*alas*tinggi;
            System.out.println("Luas segitiga : "+hasil);
        }  else if (bangunDatar.equals("lingkaran")) {
            System.out.println("Jari Jari :");
            int Jari=input.nextInt();
            double pi=22;
            double hasil= pi *(Jari*Jari)/7;
            System.out.println("Luas lingkaran : "+hasil);
            
        } else if (bangunDatar.equals("jajarGenjang")) {
            System.out.println("Alas :");
            int alas=input.nextInt();
            System.out.println("Tinggi :");
            int tinggi=input.nextInt();
            int hasil=alas*tinggi;
            System.out.println("Luas Jajar Genjang : "+hasil);
        }
    }
}

