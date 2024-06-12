package com.losevskiyfz;

public class MySQLConnectionFactory implements DatabaseConnectionFactory {

    private DatabaseConnection cachedConnection;

    @Override
    public DatabaseConnection getConnection() {
        if (cachedConnection == null) {
            cachedConnection = new MySQLConnection();
        }
        return cachedConnection;
    }

}
