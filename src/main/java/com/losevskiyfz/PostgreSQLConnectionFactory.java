package com.losevskiyfz;

public class PostgreSQLConnectionFactory implements DatabaseConnectionFactory {

    private DatabaseConnection cachedConnection;

    @Override
    public DatabaseConnection getConnection() {
        if (cachedConnection == null) {
            cachedConnection = new PostgreSQLConnection();
        }
        return cachedConnection;
    }

}
