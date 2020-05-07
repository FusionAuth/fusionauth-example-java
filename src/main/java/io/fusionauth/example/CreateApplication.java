package io.fusionauth.example;

import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import io.fusionauth.domain.Application;
import io.fusionauth.domain.api.ApplicationRequest;
import io.fusionauth.domain.api.ApplicationResponse;
import com.inversoft.rest.ClientResponse;

public class CreateApplication {

    public static void main(String[] args) {

        ApplicationProperties.setupProperties();

        // Initiating the client
        FusionAuthClient client = new FusionAuthClient(ApplicationProperties.getApiKey(),
                ApplicationProperties.getFusionAuthURL());

        // Initiating the application and providing registration details
        Application app = new Application();

        app.name = "Todo";

        // Creating the request object
        ApplicationRequest request = new ApplicationRequest(app, null);

        // Using the returned ClientResponse object
        ClientResponse<ApplicationResponse, Errors> response = client.createApplication(null, request);

        if (response.wasSuccessful()) {
            System.out.println("Application creation successful");
        } else {
            // Handling errors
            System.out.println(response.exception);
        }
    }

}
