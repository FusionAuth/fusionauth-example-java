package io.fusionauth.example;

import java.util.UUID;
import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import com.inversoft.rest.ClientResponse;

public class DeactivateUser {

    public static void main(String[] args) {    
        
        String apiKey = "Z77y_yshOSAIfF3sd370Ns6m4VkKcAOqFpyyzSGfnF4";
        
        String fusionauthURL = "http://localhost:9011";
        
        UUID userId = UUID.fromString("c7f91df7-ed89-410b-87e7-a2b7ade9bf98");
        
        //Initiating the client
        FusionAuthClient client = new FusionAuthClient(apiKey, fusionauthURL);    
        
        //Using the returned ClientResponse object
        ClientResponse<Void, Errors> response = client.deactivateUser(userId);        
           
        if (response.wasSuccessful()) {            
            System.out.println("User deactivated successfully");             
            
        } else {
            //Handling errors
            System.out.println(response.errorResponse);
        }
    }
}
