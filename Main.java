import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Parking Lot System!");
        System.out.println("Register Admin User");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Admin Name: ");
        String adminName = scanner.nextLine();

        System.out.print("Enter Admin Mobile Number: ");
        String adminMobileNumber = scanner.nextLine();

        Admin admin = new Admin(adminName, adminMobileNumber);

        System.out.println("Admin Registered Successfully!");
        System.out.println(admin.getName() + " - " + admin.getMobileNumber());
    }
}