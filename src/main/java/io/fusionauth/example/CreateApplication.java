package io.fusionauth.example;

import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import io.fusionauth.domain.Application;
import io.fusionauth.domain.api.ApplicationRequest;
import io.fusionauth.domain.api.ApplicationResponse;
import com.inversoft.rest.ClientResponse;

public class CreateApplication {

	public static void main(String[] args) {

		String apiKey = "Z77y_yshOSAIfF3sd370Ns6m4VkKcAOqFpyyzSGfnF4";

		String fusionauthURL = "http://localhost:9011";

		// Initiating the client
		FusionAuthClient client = new FusionAuthClient(apiKey, fusionauthURL);

		// Initiating the application and providing registration details
		Application app = new Application();

		app.name = "FusionJavaApp";

		// Creating the request object
		ApplicationRequest request = new ApplicationRequest(app, null);

		// Using the returned ClientResponse object
		ClientResponse<ApplicationResponse, Errors> response = client.createApplication(null, request);

		if (response.wasSuccessful()) {
			System.out.println("Registration successful");

		} else {
			// Handling errors
			System.out.println(response.errorResponse);
		}
	}

}