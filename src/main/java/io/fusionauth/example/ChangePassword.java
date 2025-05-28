package io.fusionauth.example;

import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import io.fusionauth.domain.api.user.ChangePasswordRequest;

import com.inversoft.rest.ClientResponse;

public class ChangePassword {

    public static void main(String[] args) {

        ApplicationProperties.setupProperties();

        // Initiating the client
        FusionAuthClient client = new FusionAuthClient(ApplicationProperties.getApiKey(),
                ApplicationProperties.getFusionAuthURL());

        // Creating the request object
        ChangePasswordRequest request = new ChangePasswordRequest("fusionjava@gmail.com", "xxxxxxxxxx", "xxxxxxxxxx");

        // Using the returned ClientResponse object
        ClientResponse<Void, Errors> response = client.changePasswordByIdentity(request);

        if (response.wasSuccessful()) {
            System.out.println("Password change successful");

        } else {
            System.err.println(response.errorResponse);
        }
    }
}
