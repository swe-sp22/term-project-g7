package DB;

import java.sql.*;

public class DatabaseConnection {

    public Statement statement;
    ResultSet resultSet;

    public void connect(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_schema","root","password");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void close(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_schema","root","password");
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
//    public void close(){
//        try{
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_schema","root","");
//            connection.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
