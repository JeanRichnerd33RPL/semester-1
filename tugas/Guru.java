package tugas;
public class Guru {
    String nama,mapel,alamat;
    int id;
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
