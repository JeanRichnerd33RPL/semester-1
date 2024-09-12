package tugas3;

public class Employee {
        String nama;
    double gaji;

    public Object[] getAttributes() {
        return new Object[]{nama, gaji};
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

        // constructor biasanya sama dengan nama class
        public Employee(String a, double b){
            nama=a;
            gaji=b;
        }
        public void print(){
            System.out.println("==============================================");
            System.out.println("nama : "+nama+" | Gaji : "+ gaji );
        }

}
