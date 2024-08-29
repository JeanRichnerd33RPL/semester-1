package tugas3;

import java.util.Scanner;

public class driveEmploye {
    public static void main(String[] args) {
        String credensial="yes";
                while (credensial.equals("yes")) {
                    Scanner in = new Scanner(System.in);
                        System.out.println("masukkan NAMA | GAJI");
                        Employee dummy = new Employee(in.nextLine(),in.nextDouble());
                        dummy.print();
                    in.nextLine();
                    System.out.println("lanjut?");
                    credensial=in.nextLine();
    
                }
        // Employee e1=new Employee("jane", 3500000.00);
        // Employee e2=new Employee("Brandon", 2000000.00);
        // Employee e3=new Employee("ana", 2500000.00);
        // e1.print();
        // e2.print();
        // e3.print();
    }
}
