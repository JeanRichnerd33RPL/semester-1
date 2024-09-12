package tugas3;

import java.util.ArrayList;
import java.util.Scanner;

public class driveEmploye {
    public static void main(String[] args) {
        String credensial="yes";
        ArrayList<Employee> person= new ArrayList<>();
                while (credensial.equals("yes")) {
                    Scanner in = new Scanner(System.in);
                        System.out.println("masukkan NAMA | GAJI");
                        person.add(new Employee(in.nextLine(),in.nextDouble()));
                    in.nextLine();
                    System.out.println("lanjut?");
                    credensial=in.nextLine();
                };
                int Index=0;
                for(int i=0;i<person.size()-1;i++){
                        if((double) person.get(Index).getAttributes()[1] < (double) person.get(i+1).getAttributes()[1]){
                            Index=i+1;
                        }
                    };
                System.out.println(person.get(Index).getAttributes()[0] + " memiliki gaji tertinggi sebanyak : "+ person.get(Index).getAttributes()[1] );
    }
}
