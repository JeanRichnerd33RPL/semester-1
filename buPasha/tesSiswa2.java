import java.util.Scanner;

public class tesSiswa2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String credensial="yes";
            while (credensial.equals("yes")) {
                Scanner in = new Scanner(System.in);
                    System.out.println("masukkan NAMA | IPK | NIS");
                    Siswa dummy = new Siswa(in.nextLine(),in.nextDouble(), in.nextInt());
                    dummy.print();
                    Object[] dummyObject=dummy.getAttributes();

                    if((double) dummyObject[2] < 60){

                        System.out.println(dummy.getAttributes()[0] + " Memiliki Nilai E");
                    } else if((double) dummyObject[2] >60 && (double) dummyObject[2] <=70){
                        System.out.println(dummy.getAttributes()[0] + " Memiliki Nilai D");
                    }
                    else if((double) dummyObject[2] >70 && (double) dummyObject[2] <=80){
                        System.out.println(dummy.getAttributes()[0] + " Memiliki Nilai C");
                    }
                    else if((double) dummyObject[2] >80 && (double) dummyObject[2] <=90){
                        System.out.println(dummy.getAttributes()[0] + " Memiliki Nilai B");
                    }
                    else if((double) dummyObject[2] >90 && (double) dummyObject[2] <=100){
                        System.out.println(dummy.getAttributes()[0] + " Memiliki Nilai A");
                    } else if((double) dummyObject[2] < 0 || (double) dummyObject[2]>100){
                        throw new Error("Data anda eror, please try again");
                    }
                in.nextLine();
                System.out.println("lanjut?");
                credensial=in.nextLine();
            }

    }
}
