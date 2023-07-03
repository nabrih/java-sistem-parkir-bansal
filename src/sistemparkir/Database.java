package sistemparkir;

import java.sql.*;

public class Database {
    String url = "jdbc:mysql://localhost:3306/";
    String db = "sistemparkir";
    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String password = "";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(this.url + this.db, this.user, this.password);
    }
}
