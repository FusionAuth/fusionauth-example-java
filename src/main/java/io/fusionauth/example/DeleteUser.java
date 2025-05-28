package io.fusionauth.example;

import java.util.UUID;
import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import com.inversoft.rest.ClientResponse;

public class DeleteUser {

    public static void main(String[] args) {

        ApplicationProperties.setupProperties();

        // Initiating the client
        FusionAuthClient client = new FusionAuthClient(ApplicationProperties.getApiKey(),
                ApplicationProperties.getFusionAuthURL());

        UUID userId = UUID.fromString("c7f91df7-ed89-410b-87e7-a2b7ade9bf98");

        // Using the returned ClientResponse object
        ClientResponse<Void, Errors> response = client.deleteUser(userId);

        if (response.wasSuccessful()) {
            System.out.println(response.successResponse);

        } else {
            // Handling errors
            System.err.println(response.errorResponse);
        }
    }
}
