
import java.util.ArrayList;
import java.util.Scanner;

public class studiKasusArray {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        String condition = "yes";
        while (condition.equalsIgnoreCase("yes")) {
            Scanner input = new Scanner(System.in);
            System.out.println("gunakan tanda '-' untuk memisahkan antara nama barang dan harga");
            System.out.println("masukkan List Nama | Harga");
            String item[] = input.nextLine().split(" - ");
            list.add(item);
            System.out.println("Lanjut memilih ? (yes/no)");
            condition = input.nextLine();
        }
        for(int i=0; i<list.size(); i++){
            System.out.println("Nama Barang :" + list.get(i)[0] +" | harga barang : " + list.get(i)[1]);
        }
    }
}
