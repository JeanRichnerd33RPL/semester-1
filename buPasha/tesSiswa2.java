import java.util.Scanner;

public class tesSiswa2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Siswa dummy = new Siswa();
            System.out.println("masukkan NAMA | IPK | NIS");
            dummy.setAll( input.nextLine(),input.nextDouble(), input.nextInt());
        }

    }
}
