package jdbc;

import java.sql.*;

/**
 * Created by Todor Popov using Lenovo on 11.7.2017 г. at 23:26.
 */
public class jdbc {

    private static final String URL = "jdbc:mysql://localhost:3306/jdbc?createDatabaseIfNotExist=true";
    private static final String USER = "root";
    private static final String PASSWORD = "9010056467";




    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            try (PreparedStatement statement = (PreparedStatement) connection.createStatement()) {
                String sql = "SELECT * FROM students";
                ResultSet resultSet = statement.executeQuery(sql);

                while(resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    System.out.println(String.format("%d, %s",id, name));
                }
            }
        }




    }


}
