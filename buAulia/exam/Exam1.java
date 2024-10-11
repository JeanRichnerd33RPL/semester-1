

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp=0;
        ArrayList<Integer> Ticket= new ArrayList<>();
        for(int i=7; i>0; i-- ){
            System.out.println("masukkan Ticket yang terjual pada hari ke "+i);
            int jumlahBarang= input.nextInt();
            Ticket.add(jumlahBarang);
            temp+=jumlahBarang;
        };
        int data=0;
        for(int i=0;i<Ticket.size()-1;i++){
            if((int)Ticket.get(i) > Ticket.get(i+1))
            data=Ticket.get(i);
        }
        System.out.println("total Ticket yang terjual selama 5 hari adalah "+temp);
        System.out.println("rata rata= "+temp/5);
        System.out.println("Penjualan Ticket terbanyak yaitu "+data);
    }
}
