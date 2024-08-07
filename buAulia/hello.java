import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        try (// String nama="Bara";
                // String Alamat="Malang";
                // int umur=16;
                // char JenisKelamin='L';
                // double beratbadan=48.00;
                // // float tinggibadan=178.5f;
                // boolean status=true;
                // System.out.println("nama saya :"+nama);
                // System.out.println(" saya berumur :"+umur+" tahun");
                // System.out.println(" saya tinggal di :"+ Alamat);
                // System.out.println(" Jenis Kelamin :"+ JenisKelamin );
                // System.out.println(" berat badan saya :"+beratbadan);
                // System.out.println( " true/false :" +status);
        Scanner input = new Scanner(System.in)) {
            System.out.println("masukkan data lengkap : ");
            // String Nama= input.next();
            // int Umur= input.nextInt();
            // String Kelas= input.next();
            // String Sekolah= input.next();
            // String Alamat= input.next();
            // double beratbadan= input.nextDouble();
            // Float tinggibadan= input.nextFloat();
            // boolean status= input.nextBoolean();
            // System.out.println("nama saya " + Nama);
            // System.out.println(" saya berumur " + Umur);
            // System.out.println("saya dikelas " + Kelas);
            // System.out.println("saya bersekolah di " + Sekolah);
            // System.out.println("saya tinggal di " + Alamat);
            // System.out.println("saya memiliki berat badan sebanyak " + beratbadan);
            // System.out.println("saya memiliki tinggi badan " + tinggibadan);
            // System.out.println("semua pernyataan saya berstatus " + status);
            char JenisKelamin=input.next().charAt(0);
            System.out.println("jenis kelamin :" +JenisKelamin);
        }

    }
}
