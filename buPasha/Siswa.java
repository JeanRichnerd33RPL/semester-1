// Object Class
public class Siswa{
    String nama;
    int nis;
    double ipk;
    // constructor biasanya sama dengan nama class
    public Siswa(String a, double b, int c){
        ipk=b;
        nis=c;
        nama=a;
    }
    public void print(){
        System.out.println("==============================================");
        System.out.println("nama : "+nama+" | ipk : "+ ipk +" | nis : "+nis);
    }
}