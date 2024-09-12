import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println(" PILIH KELAS : \n1. XRPL 1 \n2. XRPL 2 \n3. XRPL 3 \n4. XRPL 4 \n5. XRPL 5 \n6. XRPL 6 \n7.XRPL 7 \n8. XRPL 8");
            int Kelas= in.nextInt();
            switch (Kelas) {
                case 1:
                    System.out.println("kelas adalah XRPL " + Kelas);
                    break;
                case 2:
                    System.out.println("kelas adalah XRPL " + Kelas);
                    break;
                case 3:
                    System.out.println("kelas adalah XRPL " + Kelas);
                    break;
                case 4:
                    System.out.println("kelas adalah XRPL " + Kelas);
                    break;
                case 5:
                    System.out.println("kelas adalah XRPL " + Kelas);
                    break;
                case 6:
                    System.out.println("kelas adalah XRPL " + Kelas);
                    break;
                case 7:
                    System.out.println("kelas adalah XRPL " + Kelas);
                    break;
                case 8:
                    System.out.println("kelas adalah XRPL " + Kelas);
                    break;
            
                default:
                    System.out.println("kelas tidak terdaftar");
                    break;
            }
    }
    
}
}
