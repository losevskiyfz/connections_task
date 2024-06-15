package com.losevskiyfz;

public class App {

    private DatabaseConnectionFactory databaseConnectionFactory;

    public App(){}

    public void configureConnection(String connectionProviderConfig){
        switch (connectionProviderConfig){
            case "postgresql":
                databaseConnectionFactory = new PostgreSQLConnectionFactory();
                break;
            case "oracle":
                databaseConnectionFactory = new OracleConnectionFactory();
                break;
            case "mysql":
                databaseConnectionFactory = new MySQLConnectionFactory();
                break;
            default:
                throw new RuntimeException("Invalid database provider configuration property: " + connectionProviderConfig);
        }
    }

    public DatabaseConnection getDatabaseConnection() {
        return databaseConnectionFactory.getConnection();
    }

}
