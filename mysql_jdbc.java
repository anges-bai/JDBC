import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

try {
            // 加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost/",
                            "root",
                            "");

            Statement stmt = connection.createStatement();

            stmt.execute("create database my_jdbc_db");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }



