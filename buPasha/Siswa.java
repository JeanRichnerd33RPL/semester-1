// Object Class
public class Siswa{
    private String nama;
    private int nis;
    private double ipk;


    // constructor biasanya sama dengan nama class
    public Siswa(String a, double b, int c){
        ipk=b;
        nis=c;
        nama=a;
    }
    public Object[] getAttributes() {
        return new Object[]{nama, nis, ipk};
    }
    public void setAll(Object[] attributes){
        if(attributes[0] instanceof String){
            nama=(String) attributes[0];
        }
        if(attributes[0] instanceof Double){
            ipk=(double) attributes[0];
        }
        if(attributes[0] instanceof Integer){
            nis=(int) attributes[0];
        }
    }
    public void print(){
        System.out.println("==============================================");
        System.out.println("nama : "+nama+" | ipk : "+ ipk +" | nis : "+nis);
    }
}