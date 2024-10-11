


import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp=0;
        for(int i=5; i>0; i-- ){
            System.out.println("masukkan ticket yang masuk pada hari ke "+i);
            int jumlahBarang= input.nextInt();
            temp+=jumlahBarang;
        };
        System.out.println("total barang yang masuk selama 5 hari adalah "+temp);
        System.out.println("rata rata= "+temp/5);
    }
}
