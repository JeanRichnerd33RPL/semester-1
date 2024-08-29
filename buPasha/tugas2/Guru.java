package tugas2;
public class Guru {
    private String nama;
    private String mapel;
    private String alamat;
    private int id;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Guru(String a, String b, String c, int d){
        nama=a;
        mapel=b;
        alamat=c;
        id=d;
    }
    public void print(){
        System.out.println("======================================================================");
        System.out.println("nama : "+nama+" | mapel : "+ mapel +" | alamat : "+alamat +" | id : "+id);
    }
}
