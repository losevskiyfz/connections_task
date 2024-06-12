package com.losevskiyfz;

public class OracleConnectionFactory implements DatabaseConnectionFactory {

    private DatabaseConnection cachedConnection;

    @Override
    public DatabaseConnection getConnection() {
        if (cachedConnection == null) {
            cachedConnection = new OracleConnection();
        }
        return cachedConnection;
    }
}
