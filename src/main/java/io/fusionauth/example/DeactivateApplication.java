package io.fusionauth.example;

import java.util.UUID;
import io.fusionauth.client.FusionAuthClient;
import com.inversoft.error.Errors;
import com.inversoft.rest.ClientResponse;

public class DeactivateApplication {

	public static void main(String[] args) {

		ApplicationProperties.setupProperties();

		// Initiating the client
		FusionAuthClient client = new FusionAuthClient(ApplicationProperties.getApiKey(),
				ApplicationProperties.getFusionAuthURL());

		UUID appId = UUID.fromString("991001b4-d196-4204-b483-a0ed5dbf7666");

		// Using the returned ClientResponse object
		ClientResponse<Void, Errors> response = client.deactivateApplication(appId);

		if (response.wasSuccessful()) {

			System.out.println("Application deactivated successfully");

		} else {
			// Handling errors
			System.out.println(response.errorResponse);
		}
	}
}
