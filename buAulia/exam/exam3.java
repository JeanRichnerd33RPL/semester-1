


import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp=0;
        for(int i=5; i>0; i-- ){
            System.out.println("masukkan gaji karyawan ke "+ (i));
            int jumlahGaji= input.nextInt();
            temp+=jumlahGaji;
        };
        System.out.println("jumlah gaji total karyawan" +temp);
        System.out.println("rata rata= "+temp/5);
    }
}
