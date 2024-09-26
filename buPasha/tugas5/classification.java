package tugas5;

import java.util.Scanner;

class Person{
    private String name;
    private int age;
    public Person(String Name, int Age){
        this.name=Name;
        this.age=Age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println("Nama : "+ name +" | "+ "Age : "+ this.age +" | ");
    }
}

class Student extends Person{
    private  int studentNumber;
    private int score;
    private String major;
    
    public Student(String Name, String Major, int Age, int NumberStudent, int Score){
        super(Name, Age);
        this.studentNumber=NumberStudent;
        this.score=Score;
        this.major=Major;
        print();
    }
    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void print(){
        System.out.println("Nama : "+ super.getName() +" | "+ "Age : "+ super.getAge() +" | " + "Student Number : "+ this.studentNumber +" | "+ "Score : "+ this.score +" | " +"Major : "+ this.major +" | ");
    }

}

class Teacher extends Person{
    private String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String Name, String Subject, int Age){
        super(Name, Age);
        this.subject=Subject;
    }
    public void print(){
        System.out.println("Nama : "+ super.getName() +" | "+ "Age : "+ super.getAge()+" | " + "Subject : "+ this.subject +" | ");
    }
}

class Fulltime extends Teacher{
    private int anualSalary;
    private String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public Fulltime(String Name, String Subject, String Unit, int Age, int AnualSalary){
        super(Name, Subject, Age);
        this.anualSalary=AnualSalary;
        this.unit=Unit;
        print();
    }
    public void print(){
        System.out.println("Nama : "+ super.getName() +" | "+ "Age : "+ super.getAge()+" | " + "Subject : "+ super.getSubject() +" | "  + "Anual Salary : "+ this.anualSalary +" | "  + "Unit : "+ this.unit +" | ");
    }
}
class PartTime extends Teacher{
    private int houseWorked;
    private int salary;
    public int getHouseWorked() {
        return this.houseWorked;
    }
    public int salary() {
        return this.salary;
    }

    public void setHouseWorked(int houseWorked) {
        this.houseWorked = houseWorked;
    }
    public void setSalary(int HouseWorked){
        this.salary=HouseWorked*20*10000;
    }
    public PartTime(String Name, String Subject, int Age, int HouseWorked){
        super(Name, Subject, Age);
        this.houseWorked= HouseWorked;
        setSalary(HouseWorked);
        print();
    }
    public void print(){
        System.out.println("Nama : "+ super.getName() +" | "+ "Age : "+ super.getAge()+" | " + "Subject : "+ super.getSubject() +" | "  + "House Workde : "+ this.houseWorked+" | "+ "Gaji :" +this.salary);
    }
}

public class classification {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String credensial = "yes";  
        String type = "";
        int i=0;
        while (credensial.equals("yes")) {
            Scanner in = new Scanner(System.in);
            System.out.println("Student/Teacher ? ");
            type = in.nextLine();
            if (type.equalsIgnoreCase("Student")) {
                System.out.println("masukkan Nama |  Jurusan | Age | Score |");
                @SuppressWarnings("unused")
                Student dummy = new Student(in.nextLine(),in.nextLine(),in.nextInt(),(i+1),in.nextInt());
            } else if (type.equalsIgnoreCase("Teacher")) {
                System.out.println("Pilih Cara Kerja : FullTime/PartTime");
                type=in.nextLine();
                if(type.equalsIgnoreCase("FullTime")){
                    System.out.println("masukkan Nama | Subject | Unit | Umur | Gaji");
                    @SuppressWarnings("unused")
                    Fulltime dummy=new Fulltime(in.nextLine(),in.nextLine(),in.nextLine(),in.nextInt(),in.nextInt());
                } else if(type.equalsIgnoreCase("PartTime")){
                    System.out.println("masukkan Nama | Subject | Umur | Jam Kerja");
                    @SuppressWarnings("unused")
                    PartTime dummy=new PartTime(in.nextLine(), in.nextLine(), in.nextInt(), in.nextInt());
                } else{
                    throw new Error("error please make sure your input in valid");
                }
            } else{
                throw new Error("masukkan input yang validd");
            }
            in.nextLine();
            System.out.println("lanjut? (yes/no)");
            credensial = in.nextLine();
            i++;
        }
    }
}
