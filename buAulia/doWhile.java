import java.util.ArrayList;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        String nama;
        String kelas;
        String perilaku;
        int nilai;
        ArrayList<String> ListNama = new ArrayList<>();
        try(Scanner in = new Scanner(System.in)){
            String credential="yes";
        do {
            System.out.print("masukkan nama anda : ");
                nama= in.nextLine();
                System.out.print("masukkan kelas anda : ");
                kelas= in.nextLine();
                if(kelas.equalsIgnoreCase("X")||(kelas.equalsIgnoreCase("XI"))){
                    System.out.println("masukkan Perilaku Siswa: (Baik/Cukup)");
                    perilaku= in.nextLine();
                    if(perilaku.equalsIgnoreCase("Baik")){
                        System.out.print("masukkan NILAI : ");
                        nilai=in.nextInt();
                        if(nilai >=90){
                            in.nextLine();
                            System.out.println("SELAMAT "+nama.toUpperCase()+ " ANDA LOLOS \n");
                            ListNama.add(nama);
                            System.out.println(" kandidat yang lolos yaitu : ");
                            for(int i=0; i<(ListNama).size(); i++){
                                System.out.println("- "+ListNama.get(i));
                            }
                            System.out.print("lanjut? ");
                            credential=in.nextLine();
                        } else{
                            in.nextLine();
                            System.out.println("nilai anda tidak mencukupi");
                        }
                    }
                    else{
                        System.out.println("perilaku kurang baik");
                    }
                } 
                else{
                    System.out.println("tidak masuk dalam kriteria");
                }
        } while (credential.equalsIgnoreCase("yes"));
    }
    }
}
