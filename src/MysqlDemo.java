import java.sql.*;

public class MysqlDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://120.92.102.81:4201/test";
        String username = "root";
        String password = "tidb@123";
        String query = "SELECT * FROM sbt1 limit 200";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            int rowCount = 0;
            while (resultSet.next()) {
                rowCount++;
                // 在这里可以根据需要处理每一行的数据
            }

            System.out.println("行数：" + rowCount);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
