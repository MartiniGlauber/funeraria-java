/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost:3306/funeraria_um_irmao?";
    private static final String USER = "root";

   // private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String SENHA = "root";

    public static Connection getConnection() {
        try {
            //Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USER, SENHA);
            return con;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
