package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reservar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\t<head>\n");
      out.write("            \n");
      out.write("                <link href=\"Reservacion.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("                                <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1256\">\n");
      out.write("\t\t<title>Realizar Reservacion</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("            <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("            <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("            <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\t</head>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\t<body >\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <div class=\"Registrar\" >\n");
      out.write("                    <h1 style=\"padding-top:10px; text-align: center; width: 100%;\"> Reservar Habitacion </h1>\n");
      out.write("                     <form  method=\"post\" action = \"ReservacionSer\">\n");
      out.write("                        \n");
      out.write("                         <label> Nombre Completo: <input type=\"texts\" name=\"nc\"/><br> </label>\n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                        <label for=\"datepicker\">Fecha de Nacimiento:</label>\n");
      out.write("                               <input type=\"texts\" name=\"fecha\" id=\"datepicker\">\n");
      out.write("                        <label> Correo Electronico: \n");
      out.write("                               <input type=\"texts\" name=\"cor\"/> </label>\n");
      out.write("\n");
      out.write("                        <h1> Informacion de la Tarjeta </h1>\n");
      out.write("\n");
      out.write("                        <label> Numero de la Tarjeta:\n");
      out.write("                               <input type=\"texts\" name=\"numt\"/> </label>             \n");
      out.write("\n");
      out.write("                               <button type=\"submit\" name=\"conf\">Confirmar</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
