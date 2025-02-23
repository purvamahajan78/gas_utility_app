package com.gasutility;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceRequestManager requestManager = new ServiceRequestManager();
        Scanner scanner = new Scanner(System.in);

        // Using System.out.println to print messages
        System.out.println("Welcome to the Gas Utility Service System");
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Submit a new service request");
            System.out.println("2. Track request status");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    // Submit new request
                    System.out.print("Enter your name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter request type (e.g., Gas Leak, Billing Issue, etc.): ");
                    String requestType = scanner.nextLine();
                    System.out.print("Enter request details: ");
                    String details = scanner.nextLine();
                    
                    ServiceRequest newRequest = new ServiceRequest(customerName, requestType, details);
                    requestManager.submitRequest(newRequest);
                    System.out.println("Service request submitted successfully!");
                    break;
                    
                case 2:
                    // Track request status
                    System.out.print("Enter Request ID to track: ");
                    String requestId = scanner.nextLine();
                    ServiceRequest request = requestManager.getRequestById(requestId);
                    if (request != null) {
                        System.out.println(request);
                    } else {
                        System.out.println("Request not found.");
                    }
                    break;
                    
                case 3:
                    // Exit the program
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
