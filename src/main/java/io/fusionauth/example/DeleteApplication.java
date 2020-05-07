package io.fusionauth.example;

import java.util.UUID;
import io.fusionauth.client.FusionAuthClient;

import com.inversoft.error.Errors;
import com.inversoft.rest.ClientResponse;

public class DeleteApplication {

    public static void main(String[] args) {    
        
        String apiKey = "Z77y_yshOSAIfF3sd370Ns6m4VkKcAOqFpyyzSGfnF4";
        
        String fusionauthURL = "http://localhost:9011";
        
        UUID appId = UUID.fromString("991001b4-d196-4204-b483-a0ed5dbf7666");
        
        //Initiating the client
        FusionAuthClient client = new FusionAuthClient(apiKey, fusionauthURL);    
        
        //Using the returned ClientResponse object
        ClientResponse<Void, Errors> response = client.deleteApplication(appId);        
           
        if (response.wasSuccessful()) {    
            //Outputting the application's details
            System.out.println(response.successResponse);        
            
        }else {
            //Handling errors
            System.out.println(response.errorResponse);
        }
    }
}