// Object Class
public class Siswa{
    String nama;
    int nis;
    double ipk;
    // constructor biasanya sama dengan nama class
    public Siswa(){
        nama="";
        ipk=0;
        nis=0;
    }
    public void studentSetIpk(double x){
        ipk=x;
    }
    public void studentSetNis(int x){
        nis=x;
    }
    public void studentSetNama(String x){
        nama=x;
    }
}