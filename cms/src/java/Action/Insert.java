/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionSupport;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;


/**
 *
 * @author Prathamesh Dongre
 */
public class Insert extends ActionSupport implements ServletRequestAware {
    private String name;
    private String username;
    private String location;
    private String password;
    private String confirmpassword;
    String cname;
    String uname;
    String pass;
    String loc;
    String id;
    String cpass;
    private ResultSet rs;

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String execute() throws Exception {
        cname = getName();
        uname = getUsername();
        loc = getLocation();
       
        pass = getPassword();
        cpass = getConfirmpassword();
        System.out.println("unameee>>>>>>>" + cname);
        System.out.println("unameee>>>>>>>" + uname);
        System.out.println("unameee>>>>>>>" + loc);
        System.out.println("password>>>>>>>" + pass);
        System.out.println("id>>>>>>>" + id);
        // inserting values
        try {
            Connection con = Dataconn.Datasource.getConnection();
            PreparedStatement pstmt = con.prepareStatement("insert into customer values(?,?,?,?,?)");
            pstmt.setString(2, cname);
            pstmt.setString(3, uname);
            pstmt.setString(4, loc);
            //pstmt.setString(4, uname);
            pstmt.setString(5, pass);
            pstmt.executeUpdate();
            System.out.println("inserted successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    return "success";
    }

    public void setServletRequest(HttpServletRequest hsr) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
