<%-- 
    Document   : index
    Created on : 21 Mar, 2016, 1:51:51 AM
    Author     : Prathamesh Dongre
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CMS</title>
    </head>
     <body bgcolor="coral">

        <form  action="user">
            <div style="background-image: url(images/images.jpeg)">
            <center><h1>User Information</h1></center>
            </div>


                <table  cellspacing="10" cellpadding="10" style="border-radius:25px;margin-top:-170px" bgcolor="cornsilk" align="center" cellspacing="3" border-collapse:collapse >

                    <tr>
                        <td>
                            Name:
                        </td>
                        <td style="color: firebrick;font-style: italic">
                            <s:fielderror  fieldName="name" theme="simple"> </s:fielderror>
                            <input type="text" name="name" id="name">
                        </td>
                    </tr>

                    <br><br>
                    <tr>
                        <td>
                            Username:
                        </td>
                        <td style="color: firebrick;font-style: italic">
                            <s:fielderror  fieldName="username" theme="simple"></s:fielderror>
                            <input type="text" name="username" id="username">
                        </td>
                    </tr>
                    <br><br>
                    <tr>
                        <td>
                            Location:
                        </td>
                        <td style="color: firebrick;font-style: italic">
                            <s:fielderror  fieldName="location" theme="simple"></s:fielderror>
                            <input type="text" name="location" id="location">
                        </td>
                    </tr>
                    <br><br>
                    <tr>
                        <td>
                            Password:
                        </td>
                        <td>
                            <s:fielderror  fieldName="password" theme="simple"></s:fielderror>
                            <input type="password" name="password" id="password">
                        </td>
                    </tr>
                    <br><br>
                    <tr>
                        <td>
                            Confirm Password:
                        </td>
                        <td>
                            <s:fielderror  fieldName="confirmpassword" theme="simple"></s:fielderror>
                            <input type="password" name="confirmpassword" id="confirmpassword" onkeyup="Validatepass(); return false;">
                        </td>
                    </tr>
                    <br><br>
                    <tr>
                        <td> </td>
                        <td>
                            <span id="confirmMessage" class="confirmMessage">

                            </span>
                        </td>
                    </tr>
                    <th colspan="2">
                        <center>
                            <input type="submit" value="sumbit" >
                        </center>
                    </th>
                </table>

        </form>
    </body>
</html>
