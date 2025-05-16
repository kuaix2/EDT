package dao;

import java.sql.*;

public class Database {
    private static final String URL = "jdbc:sqlite:edt.db";
    private Connection conn;

    /** À appeler une seule fois au démarrage de l’appli */
    public void connect() throws SQLException {
        conn = DriverManager.getConnection(URL);
        System.out.println("Connecté à SQLite !");
        // création automatique des tables
        initSchema();
    }

    private void initSchema() throws SQLException {
        String ddl = """
            CREATE TABLE IF NOT EXISTS evenements (
              id INTEGER PRIMARY KEY AUTOINCREMENT,
              titre TEXT NOT NULL,
              date TEXT NOT NULL
            );
        """;
        try (Statement st = conn.createStatement()) {
            st.executeUpdate(ddl);
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void close() throws SQLException {
        if (conn != null) conn.close();
    }
}
