package io.fusionauth.example;
import java.util.UUID;
import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import io.fusionauth.domain.api.UserResponse;

import com.inversoft.rest.ClientResponse;

public class ReactivateUser {

    public static void main(String[] args) {    
        
		ApplicationProperties.setupProperties();
           	 
    	//Initiating the client
    	FusionAuthClient client = new FusionAuthClient(ApplicationProperties.getApiKey(), ApplicationProperties.getFusionAuthURL());    
        
        UUID userId = UUID.fromString("c7f91df7-ed89-410b-87e7-a2b7ade9bf98"); 
        
        //Using the returned ClientResponse object
        ClientResponse<UserResponse, Errors> response = client.reactivateUser(userId);        
           
        if (response.wasSuccessful()) {
        //Outputting the user's profile details            
            System.out.println(response.successResponse.user);             
            
        } else {
            //Handling errors
            System.out.println(response.errorResponse);
        }
    }

}
