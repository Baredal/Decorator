package ua.edu.ucu.apps;
import java.sql.Connection;
import java.sql.DriverManager;

import lombok.Getter;
import lombok.SneakyThrows;
public class DatabaseConnection {
    private static DatabaseConnection databaseConnection;
    @Getter
    private Connection connection;

    @SneakyThrows
    private DatabaseConnection() {
        Class.forName("org.sqlite.JDBC");
        String dbUrl = "jdbc:sqlite:D:/sqliteLib/texts.sqlite3";
        connection = DriverManager.getConnection(dbUrl);
    }

    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        } 
        return databaseConnection;
    }

}