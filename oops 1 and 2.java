class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Sunidhi", 18);
        Person p2 = new Person("Rahul", 20);

        p1.display();
        p2.display();
    }
}
import java.util.*;

class Book {
    String title, author, isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(book -> book.isbn.equals(isbn));
    }

    void display() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        }
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.addBook(new Book("Java", "James", "101"));
        l.addBook(new Book("Python", "Guido", "102"));
        l.display();
    }
}
class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equals("Small Car"))
            Rent = 1000;
        else if (CarType.equals("Van"))
            Rent = 800;
        else
            Rent = 2500;
        return Rent;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + GetRent());
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(1, "SUV");
        c.ShowCar();
    }
}
class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equals("Small Car"))
            Rent = 1000;
        else if (CarType.equals("Van"))
            Rent = 800;
        else
            Rent = 2500;
        return Rent;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + GetRent());
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar(1, "SUV");
        c.ShowCar();
    }
}
class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata(int no, String name, float b, float h, float d) {
        empno = no;
        ename = name;
        basic = b;
        hra = h;
        da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.havedata(1, "Amit", 10000, 2000, 1500);
        e.dispdata();
    }
}
class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println(r1.Area());
        System.out.println(r2.Area());
    }
}
abstract class Shape {
    abstract double calculate_area();

    void display_info() {
        System.out.println("Shape info");
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    double calculate_area() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double calculate_area() {
        return l * b;
    }
}

class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(4, 5);

        s1.display_info();
        System.out.println(s1.calculate_area());

        s2.display_info();
        System.out.println(s2.calculate_area());
    }
}
interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying image filter: " + type);
    }

    public void reset_filter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying data filter: " + type);
    }

    public void reset_filter() {
        System.out.println("Data filter reset");
    }
}

class Main {
    public static void main(String[] args) {
        Filterable f1 = new ImageProcessor();
        Filterable f2 = new DataAnalyzer();

        f1.apply_filter("blur");
        f2.apply_filter("low-pass");
    }
}
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(2, 3));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2.5, 3.5));
    }
}
interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

class TestBank {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI: " + b.getInterestRate());
    }
}
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area(double r) {
        System.out.println("Circle area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area(double l, double b) {
        System.out.println("Rectangle area: " + (l * b));
    }
}

class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area(3);

        r.display();
        r.area(4, 5);
    }
}
abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid via Credit Card: " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid via Net Banking: " + amount);
    }
}

class Main {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);

        p = new UPIPayment();
        p.pay(500);

        p = new NetBankingPayment();
        p.pay(2000);
    }
}
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double salary, incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    double calculateBonus() {
        return salary * 0.10 + incentive;
    }
}

class Main {
    public static void main(String[] args) {
        Employee e;

        e = new Manager("Amit", 1, 50000);
        System.out.println("Manager Bonus: " + e.calculateBonus());

        e = new Developer("Rahul", 2, 40000, 5000);
        System.out.println("Developer Bonus: " + e.calculateBonus());
    }
}
class Person {
    void role() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    void role() {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("I am a manager");
    }
}

class Test {
    public static void main(String[] args) {
        Person p = new Manager();
        p.role();
    }
}
abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 12;
    }
}

class Main {
    public static void main(String[] args) {
        Ride[] rides = {
            new BikeRide(10),
            new AutoRide(10),
            new CarRide(10)
        };

        for (Ride r : rides) {
            System.out.println(r.calculateFare());
        }
    }
}
class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treats patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assists doctor");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist handles appointments");
    }
}

class Main {
    public static void main(String[] args) {
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}
class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public static void main(String[] args) {
        new Employee("A", 1);
        new Employee("B", 2);
        new Employee("C", 3);

        showCount();
    }
}
class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        System.out.println(b.calculateInterest(10000));
        System.out.println(b.calculateInterest(5000));
    }
}
class Book {
    String title, author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book("Java", "James", 500),
            new Book("Python", "Guido", 600)
        };

        for (Book b : books) {
            b.display();
        }
    }
}
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Sunidhi", 50000);
        e.display();
    }
}