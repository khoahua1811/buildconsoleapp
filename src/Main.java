import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import managers.ClaimProcessManager;
import models.Claim;
import managers.SimpleClaimProcessManager;

public class Main {

    private static final ClaimProcessManager claimManager = new SimpleClaimProcessManager();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("---- Insurance Claim Management System ----");
            System.out.println("1. Add new insurance claim");
            System.out.println("2. Update information of insurance claim");
            System.out.println("3. Delete insurance claim");
            System.out.println("4. Get information of insurance claim by ID");
            System.out.println("5. Get a list of all insurance claims");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 3:
                    deleteClaim();
                    break;
                case 0:
                    System.out.println("Exiting the program!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void deleteClaim() {
        System.out.println("Enter the ID of the insurance claim to delete:");
        String id = scanner.nextLine();

        claimManager.delete(id);
        System.out.println("Insurance claim deleted successfully!");
    }
}
