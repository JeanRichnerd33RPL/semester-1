package tugas;
public class Guru {
    String nama,mapel,alamat;
    int id;
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
