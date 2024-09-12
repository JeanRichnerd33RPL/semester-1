package tugas4;

import java.util.Scanner;

class Product {
    private int number;
    private String name;
    private int quantity;
    private double price;

    public Product(int num, String nam, int quan, double pri) {
        this.number = num;
        this.name = nam;
        this.quantity = quan;
        this.price = pri;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Nama : " + name + " | " + " Quantity : "+quantity + " | " + " Price : "+price + " Number : "+number);
    }
}

class CD extends Product {
    private String artist;
    private int numSong;
    private String label;

    public CD(String arts, String lab, String nam, int nums, int quan, double pri, int num) {
        super(num, nam, quan, pri);
        this.artist = arts;
        this.numSong = nums;
        this.label = lab;
        print();
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void print(){
        System.out.println("Artist : "+ artist +" | "+ " Total Song : "+numSong + " | " + " Label : "+label);
    }
}

class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD(String rat, String stu, String nam, int len, int num, int quan, double pri) {
        super(num, nam, quan, pri);
        this.length = len;
        this.rating = rat;
        this.studio = stu;
        print();
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    @Override
    public void print(){
        System.out.println("Length : "+ length +" | "+ " Rating : "+ rating + " | " + " Studio : "+studio);
    }
}

public class Inheritance {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String credensial = "yes";  
        String type = "";
        while (credensial.equals("yes")) {
            Scanner in = new Scanner(System.in);
            System.out.println("CD / DVD ? ");
            type = in.nextLine();
            if (type.equalsIgnoreCase("CD")) {
                System.out.println("masukkan artist |  Label | Nama | numberSong | quantity | price | Number");
                @SuppressWarnings("unused")
                CD dummy = new CD(in.nextLine(), in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt(),
                        in.nextDouble(), in.nextInt());
            } else if (type.equalsIgnoreCase("DVD")) {
                System.out.println("masukkan artist |  Label | Nama | numberSong | quantity | price | Number");
                @SuppressWarnings("unused")
                DVD dummy = new DVD(in.nextLine(), in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt(),
                        in.nextInt(), in.nextDouble());
            } else{
                throw new Error("masukkan input yang validd");
            }
            in.nextLine();
            System.out.println("lanjut?");
            credensial = in.nextLine();
        }
    }
}