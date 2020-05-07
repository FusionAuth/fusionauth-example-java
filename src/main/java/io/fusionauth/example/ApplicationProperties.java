package io.fusionauth.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties {

    private static String apiKey;
    private static String fusionAuthURL;

    public static String getApiKey() {
        return apiKey;
    }

    public static String getFusionAuthURL() {
        return fusionAuthURL;
    }

    public static void setupProperties() {
        try (InputStream input = ApplicationProperties.class.getResourceAsStream("/application.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);
            fusionAuthURL = prop.getProperty("fusionAuthURL");
            apiKey = prop.getProperty("apiKey");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}