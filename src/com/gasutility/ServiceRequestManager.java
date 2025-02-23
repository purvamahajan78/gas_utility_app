
package com.gasutility;


import java.util.ArrayList;
import java.util.List;

public class ServiceRequestManager {
    private List<ServiceRequest> requests = new ArrayList<>();

    // Submit a new service request
    public void submitRequest(ServiceRequest request) {
        requests.add(request);
    }

    // Get a request by its ID
    public ServiceRequest getRequestById(String requestId) {
        for (ServiceRequest request : requests) {
            if (request.getRequestId().equals(requestId)) {
                return request;
            }
        }
        return null;
    }
}

