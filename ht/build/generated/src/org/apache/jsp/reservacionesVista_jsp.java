package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Procesamiento.Consulta;
import java.sql.ResultSet;

public final class reservacionesVista_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HappyTrip</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\\estilo.css\"/>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Alata' rel='stylesheet'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

            String toInsert = "";
            
            Consulta consultar = new Consulta();
            ResultSet resultado = consultar.conultaReservaciones();
            
            
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <form>\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <img onclick=\"window.location = 'PaginaPrincipal.jsp'\" class=\"img\"  src=\"img/logo.jpeg\" style=\"border-radius: 50px\">\n");
      out.write("                <h1>BIENVENIDO A HAPPYTRIP</h1>   \n");
      out.write("            </div> \n");
      out.write("            <div class=\"barra\">\n");
      out.write("                <button  class=\"btn btn-primary\" style=\" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-bottom: 4px\" >Buscar</button>\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Search..\">\n");
      out.write("                <a href=\"#\" style=\"font-family: 'Alata';font-size: 18px\">Reservaciones</a>\n");
      out.write("                <a href=\"#\" style=\"font-family: 'Alata';font-size: 18px\">Recomendados</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            <div style=\"background-color: white;\">\n");
      out.write("                <h1 style=\"text-align: center;\">Lista de Observacion</h1>\n");
      out.write("                    <table class=\"table table-striped\" id=\"tabla_vista\">\n");
      out.write("                       <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">Usuario</th>\n");
      out.write("                            <th scope=\"col\">Hotel</th>\n");
      out.write("                            <th scope=\"col\">Habitacion</th>\n");
      out.write("                            <th scope=\"col\">Fecha inicio</th>\n");
      out.write("                            <th scope=\"col\">Fecha final</th>\n");
      out.write("                            <th scope=\"col\">Mostrar Hotel</th>\n");
      out.write("                            <th scope=\"col\">Mostrar Habitacion</th>\n");
      out.write("                        </tr>\n");
      out.write("                       </thead>\n");
      out.write("                       \n");
      out.write("                        ");

                            while(resultado.next()){
                        
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( resultado.getString("u.Nombre") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( resultado.getString("h.Nombre"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( resultado.getString("th.Tipo_habitacioncol") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( resultado.getString("r.CheckIn") );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( resultado.getString("r.CheckOut") );
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"hotelVista.jsp?numero=");
      out.print(resultado.getInt("h.idHotel"));
      out.write("\">Ver Hotel</a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                 <a href=\"habitacionVista.jsp?numero=");
      out.print(resultado.getInt("hab.idHabitacion"));
      out.write("\">Ver Habitacion</a>\n");
      out.write("                            </td>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </table>                 \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("</html>");
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
