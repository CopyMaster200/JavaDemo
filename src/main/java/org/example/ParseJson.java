package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ParseJson {

    public static void ArrayChallenge() {
        try {
            // URL for the API request
            String urlString = "http://coderbyte.com/api/challenges/json/age-counting";

            // Create a URL object
            URL url = new URL(urlString);

            // Open the connection to the API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setInstanceFollowRedirects(true); // Enable redirect handling

            // Check HTTP response code
            int status = connection.getResponseCode();
            if (status != HttpURLConnection.HTTP_OK) {
                if (status == HttpURLConnection.HTTP_MOVED_TEMP || status == HttpURLConnection.HTTP_MOVED_PERM) {
                    // Get redirected URL
                    String redirectedUrl = connection.getHeaderField("Location");
                    System.out.println("Redirected to: " + redirectedUrl);
                    url = new URL(redirectedUrl);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                } else {
                    System.out.println("Error: HTTP status " + status);
                    return;
                }
            }

            // Get the response from the API
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print full response for debugging
            System.out.println("Full Response: " + response);

            // Extract the 'data' field which contains the string with key-value pairs
            String dataString = response.toString().split("\"data\":\"")[1].split("\"")[0];

            // Split the data into key-value pairs
            String[] items = dataString.split(", ");

            // Variable to hold the count of items with age >= 50
            int count = 0;

            // Loop through each item to find the age and check if it's >= 50
            for (String item : items) {
                // Split each item by "age="
                String[] keyValue = item.split("age=");

                // Check if "age=" is present in the item
                if (keyValue.length > 1) {
                    try {
                        int age = Integer.parseInt(keyValue[1].trim()); // Extract and parse the age value
                        if (age >= 50) {
                            count++; // Increment the counter if age >= 50
                        }
                    } catch (NumberFormatException e) {
                        // Handle cases where the age is not an integer
                        System.out.println("Invalid age format: " + keyValue[1]);
                    }
                }
            }

            // Print the result: the count of items with age >= 50
            System.out.println("Number of items with age >= 50: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Call the ArrayChallenge method
        ArrayChallenge();
    }
}
