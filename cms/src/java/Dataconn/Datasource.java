/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Dataconn;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Prathamesh Dongre
 */
public class Datasource {
public static Connection getConnection() {
        Connection con = null;

        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pratham", "123");

         System.out.println("Opened database Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
}
}
