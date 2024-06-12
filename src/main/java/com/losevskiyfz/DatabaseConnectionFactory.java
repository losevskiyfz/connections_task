package com.losevskiyfz;

import java.sql.SQLException;

public interface DatabaseConnectionFactory {
    DatabaseConnection getConnection();
}
