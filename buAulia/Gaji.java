import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("input jam kerja anda : ");
            int jamKerja = input.nextInt();
            System.out.println("input tarif per jam anda : ");
            int tarifPerJam=input.nextInt();
            double diskon=jamKerja*tarifPerJam*10/100;
            double total = jamKerja*tarifPerJam-diskon;
            System.out.println("gaji bersih RP. "+total);
        }
    }
}
