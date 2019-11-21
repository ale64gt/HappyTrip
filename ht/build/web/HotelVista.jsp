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

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Alata' rel='stylesheet'>
<%! String baseDeDatos1 = "";%>
<%! String baseDeDatos2 = "";%>
    <%! int idhotel = 4;%>
        <%
            String value=request.getParameter("numero");
            idhotel = Integer.parseInt(value);
            System.out.println(idhotel);
            Consulta consultar = new Consulta();
            baseDeDatos1 = consultar.consultarHabitaciones(idhotel);
            baseDeDatos2 = consultar.consultaHotel(idhotel);
            System.out.println(baseDeDatos2);
            
        %>
    
    
    <script>
        window.onload = function () {
            //open('hotelVista.html','','top=300,left=300,width=300,height=300') ;
            // Variables
            let baseDeDatos =<%=baseDeDatos1%>;
            let baseDeDatos2 = <%=baseDeDatos2%>;
                
                
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

                    // Titulo
                    let miNodoTitle = document.createElement('h5');
                    miNodoTitle.classList.add('card-title');
                    miNodoTitle.textContent =  'Habitacion: '+info['Tipo_Habitacioncol'];
                    // Precio
                    let miNodoPrecio = document.createElement('p');
                    miNodoPrecio.classList.add('card-text');
                    miNodoPrecio.textContent = 'Una descripcion de la habitacion';
                    // Boton
                    let miNodoBoton = document.createElement('button');
                    miNodoBoton.classList.add('btn', 'btn-primary');
                    miNodoBoton.textContent = 'Reservar';
                    miNodoBoton.setAttribute('marcador', info['idHabitacion']);
                    miNodoBoton.addEventListener('click', function (event) {
                                let num = this.getAttribute('marcador');
                                
                                window.location = 'habitacionVista.jsp?numero='+num;
                        },
                        false);
                    // Insertamos
                    miNodoCardBody.appendChild(miNodoImagen);
                    miNodoCardBody.appendChild(miNodoTitle);
                    miNodoCardBody.appendChild(miNodoPrecio);
                    miNodoCardBody.appendChild(miNodoBoton);
                    miNodo.appendChild(miNodoCardBody);
                    $items.appendChild(miNodo);
                }
            }
            
            
            function cargarHotel(){
                
                
                let miNodoImagen = document.createElement('img');
                miNodoImagen.classList.add('img-fluid');
                miNodoImagen.alt = baseDeDatos2[0]['Nombre'];
                miNodoImagen.src = baseDeDatos2[0]['URL'];
                
                let miNodoNombre = document.createElement('h1');
                
                miNodoNombre.style.fontSize = "35px";
                miNodoNombre.classList.add('text');
                miNodoNombre.textContent = baseDeDatos2[0]['Nombre'];
                
                let miNodoPais = document.createElement('h1');
               
                miNodoPais.style.fontSize = "30px";
                miNodoPais.classList.add('text');
                miNodoPais.textContent = 'Pais: '+baseDeDatos2[0]['pais'];
                
                let miNodoRegion = document.createElement('h1');
                miNodoRegion.style.fontSize = "30px";
                miNodoRegion.classList.add('text');
                miNodoRegion.textContent = 'Region: '+baseDeDatos2[0]['region'];
                
                let miNodoRecomen = document.createElement('h1');
                miNodoRecomen.style.fontSize = "26px";
                miNodoRecomen.classList.add('text');
                let recomen = baseDeDatos2[0]['Recomendado']/baseDeDatos2[0]['Total']*100;
                    recomen = Math.floor(recomen);
                miNodoRecomen.textContent = 'Recomendado: '+recomen+'%';
                
                
                $infohotel.appendChild(miNodoImagen);
                $infohotel.appendChild(miNodoNombre);
                
                $infohotel.appendChild(miNodoPais);
                $infohotel.appendChild(miNodoRegion);
                $infohotel.appendChild(miNodoRecomen);
            }
            
            // Inicio
            cargarHotel();
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
                <a href="#" style="font-family: 'Alata';font-size: 18px">Reservaciones</a>
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
