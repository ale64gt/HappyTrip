package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.JSONArray;
import org.json.JSONException;
import Procesamiento.Consulta;

public final class habitacionVista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String baseDeDatos1 = "";
 int idhabitacion = 4;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>HappyTrip</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"estilo.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <link href=\"https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Alata' rel='stylesheet'>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");

            String value=request.getParameter("numero");
            idhabitacion = Integer.parseInt(value);
            System.out.println(idhabitacion);
            Consulta consultar = new Consulta();
            baseDeDatos1 = consultar.consultaHabitacion(idhabitacion);
            System.out.println(baseDeDatos1);
            
        
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        window.onload = function () {\n");
      out.write("            //open('hotelVista.html','','top=300,left=300,width=300,height=300') ;\n");
      out.write("            // Variables\n");
      out.write("            let baseDeDatos =");
      out.print(baseDeDatos1);
      out.write(";\n");
      out.write("            let baseDeDatos2 = ");
      out.print(baseDeDatos1);
      out.write(";\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            var paramstr = window.location.search.substr(1);\n");
      out.write("            var paramarr = paramstr.split (\"&\");\n");
      out.write("            var params = {};\n");
      out.write("\n");
      out.write("            for ( var i = 0; i < paramarr.length; i++) {\n");
      out.write("                var tmparr = paramarr[i].split(\"=\");\n");
      out.write("                params[tmparr[0]] = tmparr[1];\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            let $items = document.querySelector('#items');\n");
      out.write("            let $infohotel = document.querySelector('#infohotel');\n");
      out.write("            let hotel = [];\n");
      out.write("            // Funciones\n");
      out.write("            function renderItems () {\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                for (let info of baseDeDatos) {\n");
      out.write("                    \n");
      out.write("                    // Estructura\n");
      out.write("                    let miNodo = document.createElement('div');\n");
      out.write("                    miNodo.classList.add('card', 'col-sm-6');\n");
      out.write("                    // Body\n");
      out.write("                    let miNodoCardBody = document.createElement('div');\n");
      out.write("                    miNodoCardBody.classList.add('card-body');\n");
      out.write("                    //imagen\n");
      out.write("                    let miNodoImagen = document.createElement('img');\n");
      out.write("                    miNodoImagen.classList.add('card-img');\n");
      out.write("                    miNodoImagen.alt = info['Tipo_Habitacioncol'];\n");
      out.write("                    miNodoImagen.src = info['URL'];\n");
      out.write("                    // Insertamos\n");
      out.write("                    miNodoCardBody.appendChild(miNodoImagen);\n");
      out.write("                    miNodo.appendChild(miNodoCardBody);\n");
      out.write("                    $items.appendChild(miNodo);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function cargarHabitacion(){\n");
      out.write("                \n");
      out.write("                let miNodoNombre = document.createElement('h1');\n");
      out.write("                miNodoNombre.style.fontSize = \"35px\";\n");
      out.write("                miNodoNombre.classList.add('text');\n");
      out.write("                miNodoNombre.textContent = 'Tipo: '+baseDeDatos2[0]['Tipo_Habitacioncol'];\n");
      out.write("                \n");
      out.write("                let miNodoPais = document.createElement('h1');\n");
      out.write("                miNodoPais.style.fontSize = \"30px\";\n");
      out.write("                miNodoPais.classList.add('text');\n");
      out.write("                miNodoPais.textContent = 'Precio: '+baseDeDatos2[0]['Precio'];\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                $infohotel.appendChild(miNodoNombre);\n");
      out.write("                $infohotel.appendChild(miNodoPais);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            // Inicio\n");
      out.write("            cargarHabitacion();\n");
      out.write("            renderItems();\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("   \n");
      out.write("     <form>\n");
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
      out.write("\n");
      out.write("    <div style=\"margin-top: 10px\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-8\">\n");
      out.write("                <!-- Elementos generados a partir del JSON -->\n");
      out.write("                <main id=\"items\" class=\"col-sm-20 row\"></main>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                   <aside class=\"col-sm-10\">\n");
      out.write("                    <div class=\"col-sm-20 row\" id=\"infohotel\" style=\"border: 2px solid #000000; border-radius: 4px\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                    </aside>\n");
      out.write("                    <div style=\"margin-top: 10px\">\n");
      out.write("                        <label style=\"font-family: 'Alata';font-size: 18px\" >Fecha de entrada.</label>\n");
      out.write("                    <input id=\"datepicker\" width=\"276\" />\n");
      out.write("                    <script>\n");
      out.write("                    $('#datepicker').datepicker({\n");
      out.write("                    uiLibrary: 'bootstrap4'\n");
      out.write("                    });\n");
      out.write("                    </script>\n");
      out.write("                    \n");
      out.write("                    <label style=\"font-family: 'Alata';font-size: 18px\" >Fecha de salida.</label>\n");
      out.write("                    <input id=\"datepicker2\" width=\"276\" />\n");
      out.write("                    <script>\n");
      out.write("                    $('#datepicker2').datepicker({\n");
      out.write("                    uiLibrary: 'bootstrap4'\n");
      out.write("                    });\n");
      out.write("                    </script>\n");
      out.write("                    \n");
      out.write("                    <button  class=\"btn btn-primary\" style=\" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-top: 5px; text-align: center; margin: 8px 0\" >Verificar</button>\n");
      out.write("                    <button  class=\"btn btn-primary\" onclick=\"javascript:abrir('Reservar.jsp?numero=");
      out.print(value);
      out.write("')\" style=\" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-top: 5px; text-align: center; margin: 8px 0\" >Reservar</button>\n");
      out.write("                    \n");
      out.write("                    <script>\n");
      out.write("function abrir(url) {\n");
      out.write("open(url,'','top=300,left=300,width=360,height=710') ;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</html>\n");
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
