package exam;

import java.util.Scanner;

class Vehicle {
    private int numWheels;
    private double price;

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(int NumWheels, double Price) {
        this.numWheels = NumWheels;
        this.price = Price;
    }

    public void print() {
        System.out.println("wheels : " + this.numWheels + " | " + "price : " + this.price + " | ");
    }


    public void isDiskon(int Diskon) {
        double s= getPrice() * Diskon / 100;
        double x = this.price-s;
        setPrice(x); 
    }
}

class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Car(int NumDoors, boolean IsElectric, int NumWheels, double Price) {
        super(NumWheels, Price);
        this.numDoors = NumDoors;
        this.isElectric = IsElectric;
    }
    public void print() {
        System.out.println("wheels : " + super.getNumWheels() + " | " + "price : " + super.getPrice() + " | "
                + "doors : " + this.numDoors + " | " + "electric : " + this.isElectric + " | ");
    }
}

class Convertible extends Car {
    private String roofType;

    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public Convertible(String RoofType, int NumDoors, boolean IsElectric, int NumWheels, double Price) {
        super(NumDoors, IsElectric, NumWheels, Price);
        this.roofType = RoofType;
    }

    public void print() {
        System.out.println("wheels : " + super.getNumWheels() + " | " + "price : " + super.getPrice() + " | "
                + "doors : " + super.getNumDoors() + " | "
                + (super.isIsElectric() ? "Mobil Listrik " : "bukan Mobil Listrik") + " | " + "roof : " + this.roofType
                + " | ");
    }

}

class Bicycle extends Vehicle {
    private String bikeType;

    public String getBikeType() {
        return this.bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public Bicycle(String BikeType, int NumWheels, double Price) {
        super(NumWheels, Price);
        this.bikeType = BikeType;
    }

    public void print() {
        System.out.println("wheels : " + super.getNumWheels() + " | " + "price : " + super.getPrice() + " | "
                + "type : " + this.bikeType + " | ");
    }
}

public class tugas1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String credensial = "yes";
        int type = 0;
        int i = 0;
        while (credensial.equals("yes")) {
            Scanner in = new Scanner(System.in);
            System.out.println("Masukkan Roda Kendaraan Anda ? 4/2");
            type = in.nextInt();
            in.nextLine();
            if (type == 4) {
                System.out.println("masukkan Type mobil, apakah convertible (yes/no) ");
                String typeCar = in.nextLine();
                if (typeCar.equalsIgnoreCase("yes")) {
                    System.out.println("masukkan Type Atap | banyak pintu | IsElectric (true/false)  | harga | ");
                    Convertible dummy = new Convertible(in.nextLine(), in.nextInt(), in.nextBoolean(), type,
                            in.nextDouble());
                    System.out.println("apakah diskon ? yes/no");
                    in.nextLine();
                    String disc = in.nextLine();
                    if (disc.equalsIgnoreCase("yes")) {
                        System.out.println("masukkan diskon % |");
                        dummy.isDiskon(in.nextInt());
                    }
                    dummy.print();
                } else if (typeCar.equalsIgnoreCase("no")) {
                    System.out.println("masukkan | IsElectric (true/false) | door | harga | ");
                    Car dummy = new Car(type, in.nextBoolean(), in.nextInt(), in.nextDouble());
                    System.out.println("apakah diskon ? yes/no");
                    in.nextLine();
                    String disc = in.nextLine();
                    if (disc.equalsIgnoreCase("yes")) {
                        System.out.println("masukkan diskon % |");
                        dummy.isDiskon(in.nextInt());
                    }
                    dummy.print();
                } else {
                    throw new Error("error please make sure your input in valid");
                }

            } else if (type == 2) {
                System.out.println("Type sepeda | roda | harga | ");
                Bicycle dummy = new Bicycle(in.nextLine(), in.nextInt(), in.nextDouble());
                System.out.println("apakah diskon ? yes/no");
                in.nextLine();
                String disc = in.nextLine();
                if (disc.equalsIgnoreCase("yes")) {
                    System.out.println("masukkan diskon % |");
                    dummy.isDiskon(in.nextInt());
                }
                dummy.print();
            } else {
                throw new Error("masukkan input yang validd");
            }

            in.nextLine();
            System.out.println("lanjut? (yes/no)");
            credensial = in.nextLine();
            i++;
        }
    }
}
