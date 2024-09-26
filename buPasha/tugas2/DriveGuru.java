package tugas2;

import java.util.Scanner;

public class DriveGuru {
    public static void main(String[] args) {
        String credensial="yes";
            while (credensial.equals("yes")) {
                try (Scanner in = new Scanner(System.in)) {
                    System.out.println("masukkan NAMA | MAPEL | ALAMAT | ID");
                    Guru dummy = new Guru(in.nextLine(),in.nextLine(), in.nextLine(), in.nextInt());
                    dummy.print();
                    in.nextLine();
                    System.out.println("lanjut?");
                    credensial=in.nextLine();
                }
            }

    }
}
