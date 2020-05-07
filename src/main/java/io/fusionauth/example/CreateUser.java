package io.fusionauth.example;

import java.util.UUID;
import com.inversoft.error.Errors;
import io.fusionauth.client.FusionAuthClient;
import io.fusionauth.domain.User;
import io.fusionauth.domain.UserRegistration;
import io.fusionauth.domain.api.user.RegistrationRequest;
import io.fusionauth.domain.api.user.RegistrationResponse;
import com.inversoft.rest.ClientResponse;

public class CreateUser {

	public static void main(String[] args) {

		String apiKey = "Z77y_yshOSAIfF3sd370Ns6m4VkKcAOqFpyyzSGfnF4";

		String fusionauthURL = "http://localhost:9011";

		// Initiating the client
		FusionAuthClient client = new FusionAuthClient(apiKey, fusionauthURL);

		// Initiating the user and providing registration details
		User javauser = new User();
		javauser.email = "fusionjava@example.com";
		javauser.password = "mypassword101";

		// Initiating user registration and creating request object
		UserRegistration userreg = new UserRegistration();
		userreg.applicationId = UUID.fromString("1aae68ac-d4d3-4e96-b24c-c9478a309673");

		RegistrationRequest request = new RegistrationRequest(javauser, userreg);

		// Using the returned ClientResponse object
		ClientResponse<RegistrationResponse, Errors> response = client.register(null, request);

		if (response.wasSuccessful()) {
			System.out.println("Registration successful");

		} else {
			// Handling errors
			System.out.println(response.errorResponse);
		}
	}

}