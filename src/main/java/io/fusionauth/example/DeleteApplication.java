package io.fusionauth.example;

import java.util.UUID;
import io.fusionauth.client.FusionAuthClient;

import com.inversoft.error.Errors;
import com.inversoft.rest.ClientResponse;

public class DeleteApplication {

    public static void main(String[] args) {

        ApplicationProperties.setupProperties();

        // Initiating the client
        FusionAuthClient client = new FusionAuthClient(ApplicationProperties.getApiKey(),
                ApplicationProperties.getFusionAuthURL());

        UUID appId = UUID.fromString("991001b4-d196-4204-b483-a0ed5dbf7666");

        // Using the returned ClientResponse object
        ClientResponse<Void, Errors> response = client.deleteApplication(appId);

        if (response.wasSuccessful()) {
            // Outputting the application's details
            System.out.println(response.successResponse);

        } else {
            // Handling errors
            System.err.println(response.errorResponse);
        }
    }
}
