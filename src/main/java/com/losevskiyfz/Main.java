package com.losevskiyfz;

public class Main {
    public static void main(String[] args) {


        App app = new App();
        String configProperty = "postgresql";

        app.configureConnection(configProperty);

        DatabaseConnection connection = app.getDatabaseConnection();
        connection.connect();

    }
}
