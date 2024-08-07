// Driver class

public class TesSiswa {
    public static void main(String[] args) {
        // obj
        Siswa shabriMewing = new Siswa();
        shabriMewing.studentSetNama("shabri");
        shabriMewing.studentSetIpk(4.01);
        shabriMewing.studentSetNis(38203802);
        Siswa ardianSigma = new Siswa();
        ardianSigma.studentSetNama("ardian");
        ardianSigma.studentSetIpk(10.72);
        ardianSigma.studentSetNis(328398204);
        Siswa ochiTuru = new Siswa();
        ochiTuru.studentSetNama("ochi");
        ochiTuru.studentSetIpk(5.81);
        ochiTuru.studentSetNis(302830);
        System.out.println("ini data shabri berupa nama: ipk: nis:");
        System.out.println(shabriMewing.nama +" " +shabriMewing.ipk +" "+shabriMewing.nis);
        System.out.println("ini data ardian berupa nama: ipk: nis:");
        System.out.println(ardianSigma.nama +" " +ardianSigma.ipk +" "+ardianSigma.nis);
        System.out.println("ini data ochi berupa nama: ipk: nis:");
        System.out.println(ochiTuru.nama +" " +ochiTuru.ipk +" "+ochiTuru.nis);
    }
}
