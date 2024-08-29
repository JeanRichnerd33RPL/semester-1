package tugas;
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

    public Guru(){
        nama="";
        mapel="";
        alamat="";
        id=0;
    }
    public void setGuru(String n, String a, String m, int i){
        nama=n;
        alamat=a;
        mapel=m;
        id=i;
    }
}