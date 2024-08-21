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
    public void setAll(String a, double b, int c){
        ipk=b;
        nis=c;
        nama=a;
        System.out.println("nama : "+nama+" | ipk : "+ ipk +" | nis : "+nis);
    }
}