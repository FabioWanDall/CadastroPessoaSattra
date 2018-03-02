package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/testesattra_DB","root","admin");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
