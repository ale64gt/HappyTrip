package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prueba2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>HappyTrip</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"estilo.css\">\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Alata' rel='stylesheet'>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        window.onload = function () {\n");
      out.write("            // Variables\n");
      out.write("            let baseDeDatos = [\n");
      out.write("                {\n");
      out.write("                    id: 1,\n");
      out.write("                    nombre: 'Patata',\n");
      out.write("                    precio: 1,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 2,\n");
      out.write("                    nombre: 'Cebolla',\n");
      out.write("                    precio: 1.2,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 3,\n");
      out.write("                    nombre: 'Calabacin',\n");
      out.write("                    precio: 2.1,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 4,\n");
      out.write("                    nombre: 'Fresas',\n");
      out.write("                    precio: 0.6,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 5,\n");
      out.write("                    nombre: 'yohel',\n");
      out.write("                    precio: 0.6,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 6,\n");
      out.write("                    nombre: 'adriana',\n");
      out.write("                    precio: 0.6,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 7,\n");
      out.write("                    nombre: 'ale',\n");
      out.write("                    precio: 0.6,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 8,\n");
      out.write("                    nombre: 'penia',\n");
      out.write("                    precio: 0.6,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 9,\n");
      out.write("                    nombre: 'carlos',\n");
      out.write("                    precio: 0.6,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 10,\n");
      out.write("                    nombre: 'profe playo',\n");
      out.write("                    precio: 0.6,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                },\n");
      out.write("                {\n");
      out.write("                    id: 11,\n");
      out.write("                    nombre: 'el ultimo',\n");
      out.write("                    precio: 0.6,\n");
      out.write("                    imagen: 'img/hotel-ibis-hermosillo.jpg'\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            ]\n");
      out.write("            let $items = document.querySelector('#items');\n");
      out.write("            // Funciones\n");
      out.write("            function renderItems () {\n");
      out.write("                for (let info of baseDeDatos) {\n");
      out.write("                    // Estructura\n");
      out.write("                    let miNodo = document.createElement('div');\n");
      out.write("                    miNodo.classList.add('card', 'col-sm-4');\n");
      out.write("                    // Body\n");
      out.write("                    let miNodoCardBody = document.createElement('div');\n");
      out.write("                    miNodoCardBody.classList.add('card-body');\n");
      out.write("                    //imagen\n");
      out.write("                    let miNodoImagen = document.createElement('img');\n");
      out.write("                    miNodoImagen.classList.add('card-img');\n");
      out.write("                    miNodoImagen.alt = info['nombre'];\n");
      out.write("                    miNodoImagen.src = info['imagen'];\n");
      out.write("\n");
      out.write("                    // Titulo\n");
      out.write("                    let miNodoTitle = document.createElement('h5');\n");
      out.write("                    miNodoTitle.classList.add('card-title');\n");
      out.write("                    miNodoTitle.textContent = info['nombre'];\n");
      out.write("                    // Precio\n");
      out.write("                    let miNodoPrecio = document.createElement('p');\n");
      out.write("                    miNodoPrecio.classList.add('card-text');\n");
      out.write("                    miNodoPrecio.textContent = info['precio'] + '€';\n");
      out.write("                    // Boton\n");
      out.write("                    let miNodoBoton = document.createElement('button');\n");
      out.write("                    miNodoBoton.classList.add('btn', 'btn-primary');\n");
      out.write("                    miNodoBoton.textContent = 'ver más';\n");
      out.write("                    miNodoBoton.setAttribute('marcador', info['id']);\n");
      out.write("                    miNodoBoton.addEventListener('click', function (event) {\n");
      out.write("                                let num = this.getAttribute('marcador');\n");
      out.write("                                \n");
      out.write("                                window.location = 'hotelVista.html?numero='+num;\n");
      out.write("                        },\n");
      out.write("                        false);\n");
      out.write("                    // Insertamos\n");
      out.write("                    miNodoCardBody.appendChild(miNodoImagen);\n");
      out.write("                    miNodoCardBody.appendChild(miNodoTitle);\n");
      out.write("                    miNodoCardBody.appendChild(miNodoPrecio);\n");
      out.write("                    miNodoCardBody.appendChild(miNodoBoton);\n");
      out.write("                    miNodo.appendChild(miNodoCardBody);\n");
      out.write("                    $items.appendChild(miNodo);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            // Inicio\n");
      out.write("            renderItems();\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </script>\n");
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
      out.write("    <form>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <img class=\"img\"  src=\"img/logo.jpeg\" style=\"border-radius: 50px\">\n");
      out.write("            <h1 style=\"font-family: 'Alata';font-size: 40px\">BIENVENIDO A HAPPYTRIP</h1>\n");
      out.write("        </div  >\n");
      out.write("\n");
      out.write("            <div class=\"barra\">\n");
      out.write("                <button  class=\"btn btn-primary\" style=\" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-bottom: 4px\" >Buscar</button>\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Search..\" style=\"font-family: 'Alata';font-size: 18px\">\n");
      out.write("                <a href=\"#\" style=\"font-family: 'Alata';font-size: 18px\">Reservaciones</a>\n");
      out.write("                <a href=\"#\" style=\"font-family: 'Alata';font-size: 18px\">Ayuda</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"slider\" style=\"margin-top: 10px \">\n");
      out.write("                <ul>\n");
      out.write("                    <li><img src=\"img/imagen1.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img src=\"img/imagen2.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img src=\"img/imagen3.jpg\" alt=\"\"></li>\n");
      out.write("                    <li><img src=\"img/imagen5.jpg\" alt=\"\"></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <div style=\"margin-top: 10px\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- Elementos generados a partir del JSON -->\n");
      out.write("                <main id=\"items\" class=\"col-sm-13 row\"></main>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
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
