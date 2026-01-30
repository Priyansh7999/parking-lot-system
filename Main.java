import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Parking Lot System!");
        System.out.println("Register Admin User");
        Scanner scanner = new Scanner(System.in);
        String adminName;
        while (true) {
            System.out.print("Enter Admin Name: ");
            adminName = scanner.nextLine();
            if (Validator.isValidPersonName(adminName)) {
                break;
            }
            System.out.println("Invalid name. Only alphabets allowed (max 20 characters). Try again.");
        }
        String adminMobileNumber;
        while (true) {
            System.out.print("Enter Admin Mobile Number: ");
            adminMobileNumber = scanner.nextLine();
            if (Validator.isValidMobileNumber(adminMobileNumber)) {
                break;
            }
            System.out.println("Invalid mobile number. Please enter a valid Indian mobile number.");
        }
        Admin admin = new Admin(adminName, adminMobileNumber);
        System.out.println("Admin Registered Successfully!");
        System.out.println(admin.getName() + "-" + admin.getMobileNumber());
    }
}
