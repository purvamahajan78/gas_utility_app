package com.gasutility;



import java.util.UUID;

public class ServiceRequest {
    private String requestId;
    private String customerName;
    private String requestType;
    private String details;
    private String status;
    private String submissionDate;
    private String resolutionDate;

    // Constructor
    public ServiceRequest(String customerName, String requestType, String details) {
        this.requestId = UUID.randomUUID().toString();  // Generate a unique request ID
        this.customerName = customerName;
        this.requestType = requestType;
        this.details = details;
        this.status = "Submitted";
        this.submissionDate = java.time.LocalDate.now().toString();
    }

    // Method to resolve the request
    public void resolveRequest() {
        this.status = "Resolved";
        this.resolutionDate = java.time.LocalDate.now().toString();
    }

    // Getter methods
    public String getRequestId() {
        return requestId;
    }

    public String getStatus() {
        return status;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public String getResolutionDate() {
        return resolutionDate;
    }

    @Override
    public String toString() {
        return "Request ID: " + requestId + "\n" +
               "Customer: " + customerName + "\n" +
               "Request Type: " + requestType + "\n" +
               "Details: " + details + "\n" +
               "Status: " + status + "\n" +
               "Submitted on: " + submissionDate + "\n" +
               (status.equals("Resolved") ? "Resolved on: " + resolutionDate : "");
    }
}

