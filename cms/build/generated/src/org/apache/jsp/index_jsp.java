package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CMS</title>\n");
      out.write("    </head>\n");
      out.write("     <body bgcolor=\"coral\">\n");
      out.write("\n");
      out.write("        <form  action=\"user\">\n");
      out.write("            <div style=\"background-image: url(images/images.jpeg)\">\n");
      out.write("            <center><h1>User Information</h1></center>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <table  cellspacing=\"10\" cellpadding=\"10\" style=\"border-radius:25px;margin-top:-170px\" bgcolor=\"cornsilk\" align=\"center\" cellspacing=\"3\" border-collapse:collapse >\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Name:\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"color: firebrick;font-style: italic\">\n");
      out.write("                            <s:fielderror  fieldName=\"name\" theme=\"simple\"> </s:fielderror>\n");
      out.write("                            <input type=\"text\" name=\"name\" id=\"name\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Username:\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"color: firebrick;font-style: italic\">\n");
      out.write("                            <s:fielderror  fieldName=\"username\" theme=\"simple\"></s:fielderror>\n");
      out.write("                            <input type=\"text\" name=\"username\" id=\"username\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <br><br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Location:\n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"color: firebrick;font-style: italic\">\n");
      out.write("                            <s:fielderror  fieldName=\"location\" theme=\"simple\"></s:fielderror>\n");
      out.write("                            <input type=\"text\" name=\"location\" id=\"location\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <br><br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Password:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <s:fielderror  fieldName=\"password\" theme=\"simple\"></s:fielderror>\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"password\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <br><br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Confirm Password:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <s:fielderror  fieldName=\"confirmpassword\" theme=\"simple\"></s:fielderror>\n");
      out.write("                            <input type=\"password\" name=\"confirmpassword\" id=\"confirmpassword\" onkeyup=\"Validatepass(); return false;\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <br><br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> </td>\n");
      out.write("                        <td>\n");
      out.write("                            <span id=\"confirmMessage\" class=\"confirmMessage\">\n");
      out.write("\n");
      out.write("                            </span>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <th colspan=\"2\">\n");
      out.write("                        <center>\n");
      out.write("                            <input type=\"submit\" value=\"sumbit\" >\n");
      out.write("                        </center>\n");
      out.write("                    </th>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
