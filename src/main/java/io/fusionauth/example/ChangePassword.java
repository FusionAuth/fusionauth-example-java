package io.fusionauth.example;

import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import io.fusionauth.domain.api.user.ChangePasswordRequest;

import com.inversoft.rest.ClientResponse;

public class ChangePassword {

    public static void main(String[] args) {    
        
        String apiKey = "Z77y_yshOSAIfF3sd370Ns6m4VkKcAOqFpyyzSGfnF4";
        
        String fusionauthURL = "http://localhost:9011";    
                
        //Initiating the client
        FusionAuthClient client = new FusionAuthClient(apiKey, fusionauthURL);    
        
        //Creating the request object
        ChangePasswordRequest request = new ChangePasswordRequest("fusionjava@gmail.com", "xxxxxxxxxx", "xxxxxxxxxx");
        
        //Using the returned ClientResponse object
        ClientResponse<Void, Errors> response = client.changePasswordByIdentity(request);                    
           
        if (response.wasSuccessful()) {                        
            System.out.println("Password change successful");
            
        } else {
            //Handling errors
            System.out.println(response.errorResponse);
        }
    }
}