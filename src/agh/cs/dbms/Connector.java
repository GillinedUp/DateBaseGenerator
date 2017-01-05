package agh.cs.dbms;

import java.sql.*;

/**
 * Created by Yurii on 1/4/2017.
 */
public class Connector {

    public void connect(String userId, String password){
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            Connection connection = DriverManager.
                    getConnection("jdbc:jtds:sqlserver://mssql.iisg.agh.edu.pl/vyzhha_a", userId, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("SET IDENTITY_INSERT Konferencje ON\n" +
                    "insert into Konferencje (ID, Nazwa)\n" +
                    "values(0004, 'Example4')");
            statement.close();
            connection.close();
        } catch (Exception sqlEx) {
            sqlEx.printStackTrace();
        }
    }
}
