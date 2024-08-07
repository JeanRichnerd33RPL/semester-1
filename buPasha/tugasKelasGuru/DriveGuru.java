package tugasKelasGuru;

public class DriveGuru {

    public static void main(String[] args) {
        Guru pakDiaur= new Guru();
        Guru buFeni= new Guru();
        Guru pakAndre= new Guru();
        Guru buPasha= new Guru();
        Guru pakChusni= new Guru();
        // untuk alamat guru saya buat agak acak soalnya gak hafal :)

        pakDiaur.setGuru("diaur", "Malang", "ipas", 1);
        buFeni.setGuru("Feni", "KedungKandang", "matematika", 2);
        pakAndre.setGuru("Andre", "Singosari", "Bahasa Inggris", 3);
        buPasha.setGuru("Pasha", "Malang daerah smp 5", "Produktif RPL", 4);
        pakChusni.setGuru("Chusni", "Ijen", "Kesiswaan", 5);
        System.out.println(pakDiaur);
        System.out.println(buFeni);
        System.out.println(pakAndre);
        System.out.println(buPasha);
        System.out.println(pakChusni);
    }
}
