import java.util.ArrayList;
import java.util.Scanner;
class Laptop {
    String merk;
    int harga;

    public Laptop() {
        this.merk = "testing";
        this.harga = 0;
    }

    public void setMerk(String newMerk) {
        this.merk = newMerk;
    }
}

public class arrayOOP {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[0]);
        Laptop[] laptop = new Laptop[4];
        ArrayList<Laptop> ars = new ArrayList<>();
        ars.add(new Laptop());
        // ars.get(0).setMerk("hello");
        System.out.println(ars.get(0).merk);
        for (int i = 0; i < laptop.length; i++) {
            laptop[i] = new Laptop();
            laptop[i].setMerk("merk ke " + cars[i]);
        }
        for (Laptop x : laptop) {
            System.out.print(x.merk + " |");
        }
        System.out.println("");
        // kode input
        Scanner in = new Scanner(System.in);
        System.out.print("berapa list : ");
        int listLength = in.nextInt();
        String[] list = new String[listLength];
        for (int i = 0; i < listLength; i++) {
            System.out.print("masukkan value ke "+ (i + 1)+" : " );
            list[i] = in.next();
        }
        for (String x : list) {
            System.out.print(x + " | ");
        }
    }
}
