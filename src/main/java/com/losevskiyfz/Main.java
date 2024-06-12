package com.losevskiyfz;

public class Main {
    public static void main(String[] args) {

        String configProperty = "mysql";
        App app = new App(configProperty);
        DatabaseConnection connection = app.getDatabaseConnection();
        connection.connect();

    }
}
