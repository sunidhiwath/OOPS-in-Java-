import java.util.*;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        username = username.trim().toLowerCase();

        System.out.println("Cleaned Username: " + username);
    }
}
import java.util.*;

class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        if (email.contains("@gmail.com"))
            System.out.println("Valid Gmail Address");
        else
            System.out.println("Invalid Email");
    }
}
import java.util.*;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.equals(name2))
            System.out.println("Case-sensitive: Same");
        else
            System.out.println("Case-sensitive: Different");

        if (name1.equalsIgnoreCase(name2))
            System.out.println("Case-insensitive: Same");
        else
            System.out.println("Case-insensitive: Different");
    }
}
import java.util.*;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String last = sc.nextLine();

        String fullName = first + " " + last;
        System.out.println("Full Name: " + fullName);
    }
}
import java.util.*;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String last = sc.nextLine();

        String fullName = first + " " + last;
        System.out.println("Full Name: " + fullName);
    }
}
import java.util.*;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence);
        System.out.println("Total Words: " + st.countTokens());
    }
}
class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, " Java");

        System.out.println("Reversed: " + sb.reverse());
    }
}
class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");

        System.out.println("Modified String: " + sb);
    }
}
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Sunidhi");
        System.out.println(s);
    }
}
import java.util.*;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        String masked = "*".repeat(pass.length() - 2) + pass.substring(pass.length() - 2);

        System.out.println("Masked Password: " + masked);
    }
}
import java.util.*;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        try {
            if (withdraw > balance)
                throw new Exception("Insufficient Balance");
            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
import java.util.*;

class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
import java.util.*;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            System.out.println("Student age is: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }
    }
}
class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");
        } catch (Exception e) {
            System.out.println("Error reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}
class BankApplication {

    static void process() throws Exception {
        throw new Exception("Error");
    }

    public static void main(String[] args) {
        try {
            process();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
class MusicPlayer extends Thread {
    public void run() {
        try {
            System.out.println("Playing song...");
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(500);
                System.out.println("Progress " + i);
            }
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        new MusicPlayer().start();
    }
}
class DownloadManager implements Runnable {
    public void run() {
        System.out.println("Downloading file: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DownloadManager());
        Thread t2 = new Thread(new DownloadManager());

        t1.start();
        t2.start();
    }
}
class RailwayReservation {
    int seats = 1;

    synchronized void bookTicket() {
        if (seats > 0) {
            System.out.println("Ticket booked successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation obj = new RailwayReservation();

        Thread t1 = new Thread(() -> obj.bookTicket());
        Thread t2 = new Thread(() -> obj.bookTicket());

        t1.start();
        t2.start();
    }
}
class OnlineShoppingSystem {
    public static void main(String[] args) {

        Thread payment = new Thread(() -> {
            System.out.println("Processing payment...");
        });

        Thread order = new Thread(() -> {
            System.out.println("Order confirmed...");
        });

        payment.start();
        order.start();
    }
}
class ThreadPrioritySystem {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> System.out.println("Thread 1"));
        Thread t2 = new Thread(() -> System.out.println("Thread 2"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
class Restaurant {
    boolean ready = false;

    synchronized void prepare() throws Exception {
        System.out.println("Chef prepared food");
        ready = true;
        notify();
    }

    synchronized void serve() throws Exception {
        if (!ready)
            wait();
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        new Thread(() -> {
            try { r.prepare(); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { r.serve(); } catch (Exception e) {}
        }).start();
    }
}
class BankingSystem {
    int balance = 1000;

    void withdraw(int amt) {
        synchronized (this) {
            if (balance >= amt) {
                balance -= amt;
                System.out.println("Remaining balance: " + balance);
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();

        new Thread(() -> b.withdraw(500)).start();
        new Thread(() -> b.withdraw(700)).start();
    }
}
class ChatApplication {
    public static void main(String[] args) {

        Thread send = new Thread(() -> {
            System.out.println("Sending message...");
        });

        Thread receive = new Thread(() -> {
            System.out.println("Receiving message...");
        });

        send.start();
        receive.start();
    }
}