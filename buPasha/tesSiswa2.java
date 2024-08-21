import java.util.Scanner;

public class tesSiswa2 {
    public static void main(String[] args) {
        String credensial="yes";
            while (credensial.equals("yes")) {
                Scanner in = new Scanner(System.in);
                    System.out.println("masukkan NAMA | IPK | NIS");
                    Siswa dummy = new Siswa(in.nextLine(),in.nextDouble(), in.nextInt());
                    dummy.print();
                in.nextLine();
                System.out.println("lanjut?");
                credensial=in.nextLine();

            }

    }
}
