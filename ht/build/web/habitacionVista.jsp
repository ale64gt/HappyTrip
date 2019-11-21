<%-- 
    Document   : HotelVista
    Created on : Nov 19, 2019, 10:52:55 PM
    Author     : carlo
--%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONException"%>
<%@page import="Procesamiento.Consulta" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HappyTrip</title>
    <link rel="stylesheet" href="estilo.css">

    
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Alata' rel='stylesheet'>
<%! String baseDeDatos1 = "";%>
    <%! int idhabitacion = 4;%>
        <%
            String value=request.getParameter("numero");
            idhabitacion = Integer.parseInt(value);
            System.out.println(idhabitacion);
            Consulta consultar = new Consulta();
            baseDeDatos1 = consultar.consultaHabitacion(idhabitacion);
            System.out.println(baseDeDatos1);
            
        %>
    
    
    <script>
        window.onload = function () {
            //open('hotelVista.html','','top=300,left=300,width=300,height=300') ;
            // Variables
            let baseDeDatos =<%=baseDeDatos1%>;
            let baseDeDatos2 = <%=baseDeDatos1%>;
                
                
            var paramstr = window.location.search.substr(1);
            var paramarr = paramstr.split ("&");
            var params = {};

            for ( var i = 0; i < paramarr.length; i++) {
                var tmparr = paramarr[i].split("=");
                params[tmparr[0]] = tmparr[1];
            }
            
            let $items = document.querySelector('#items');
            let $infohotel = document.querySelector('#infohotel');
            let hotel = [];
            // Funciones
            function renderItems () {
                
                
                
                for (let info of baseDeDatos) {
                    
                    // Estructura
                    let miNodo = document.createElement('div');
                    miNodo.classList.add('card', 'col-sm-6');
                    // Body
                    let miNodoCardBody = document.createElement('div');
                    miNodoCardBody.classList.add('card-body');
                    //imagen
                    let miNodoImagen = document.createElement('img');
                    miNodoImagen.classList.add('card-img');
                    miNodoImagen.alt = info['Tipo_Habitacioncol'];
                    miNodoImagen.src = info['URL'];
                    // Insertamos
                    miNodoCardBody.appendChild(miNodoImagen);
                    miNodo.appendChild(miNodoCardBody);
                    $items.appendChild(miNodo);
                }
            }
            
            
            function cargarHabitacion(){
                
                let miNodoNombre = document.createElement('h1');
                miNodoNombre.style.fontSize = "35px";
                miNodoNombre.classList.add('text');
                miNodoNombre.textContent = 'Tipo: '+baseDeDatos2[0]['Tipo_Habitacioncol'];
                
                let miNodoPais = document.createElement('h1');
                miNodoPais.style.fontSize = "30px";
                miNodoPais.classList.add('text');
                miNodoPais.textContent = 'Precio: $'+baseDeDatos2[0]['Precio']+'/por noche';
               
                
                $infohotel.appendChild(miNodoNombre);
                $infohotel.appendChild(miNodoPais);
            }
            
            // Inicio
            cargarHabitacion();
            renderItems();
            
        }
        </script>







</head>
<body>
<div class="container">
   
     <form>
            <div class="header">
                <img onclick="window.location = 'PaginaPrincipal.jsp'" class="img"  src="img/logo.jpeg" style="border-radius: 50px">
                <h1>BIENVENIDO A HAPPYTRIP</h1>   
            </div> 
            <div class="barra">
                <button  class="btn btn-primary" style=" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-bottom: 4px" >Buscar</button>
                <input type="text" name="search" placeholder="Search..">
                <a href="reservacionesVista.jsp" style="font-family: 'Alata';font-size: 18px">Reservaciones</a>
                <a href="#" style="font-family: 'Alata';font-size: 18px">Recomendados</a>
            </div>
            
        </form>

    <div style="margin-top: 10px">
        <div class="container-fluid">
            <div class="row">
                <div class="col-8">
                <!-- Elementos generados a partir del JSON -->
                <main id="items" class="col-sm-20 row"></main>
                </div>
                <div class="col-4">
                   <aside class="col-sm-10">
                    <div class="col-sm-20 row" id="infohotel" style="border: 2px solid #000000; border-radius: 4px">
                        
                        
                    </div>
                
                    </aside>
                    <div style="margin-top: 10px">
                        <label style="font-family: 'Alata';font-size: 18px" >Fecha de entrada.</label>
                    <input id="datepicker" width="276" />
                    <script>
                    $('#datepicker').datepicker({
                    uiLibrary: 'bootstrap4'
                    });
                    </script>
                    
                    <label style="font-family: 'Alata';font-size: 18px" >Fecha de salida.</label>
                    <input id="datepicker2" width="276" />
                    <script>
                    $('#datepicker2').datepicker({
                    uiLibrary: 'bootstrap4'
                    });
                    </script>
                    
                    <button  class="btn btn-primary" style=" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-top: 5px; text-align: center; margin: 8px 0" >Verificar</button>
                    <button  class="btn btn-primary" onclick="javascript:abrir('Reservar.jsp?numero=<%=value%>')" style=" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-top: 5px; text-align: center; margin: 8px 0" >Reservar</button>
                    
                    <script>
                        function abrir(url) {
                        open(url,'','top=100,left=500,width=360,height=730') ;
                        }
                    </script>
                    

                    </div>
                </div>
                
                
            </div>
        </div>


    </div>





</div>


</body>
<br>
<br>
<br>
<br>
<br>
</html>
