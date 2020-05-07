package io.fusionauth.example;

import java.util.UUID;
import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import io.fusionauth.domain.api.LoginRequest;
import io.fusionauth.domain.api.LoginResponse;
import com.inversoft.rest.ClientResponse;

public class UserLogin {

    public static void main(String[] args) {

        ApplicationProperties.setupProperties();

        // Initiating the client
        FusionAuthClient client = new FusionAuthClient(ApplicationProperties.getApiKey(),
                ApplicationProperties.getFusionAuthURL());

        UUID appId = UUID.fromString("1aae68ac-d4d3-4e96-b24c-c9478a309673");
        // Creating the request object
        LoginRequest request = new LoginRequest(appId, "fusionjava@example.com", "mypassword101");

        // Using the returned object
        ClientResponse<LoginResponse, Errors> response = client.login(request);

        if (response.wasSuccessful()) {
            System.out.println("Login successful");

        } else {
            // Handling errors
            System.out.println(response.errorResponse);
        }
    }

}
