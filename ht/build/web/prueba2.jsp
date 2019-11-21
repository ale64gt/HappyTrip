<%-- 
    Document   : prueba2
    Created on : Nov 19, 2019, 10:50:22 PM
    Author     : carlo
--%>

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

    <script>
        window.onload = function () {
            // Variables
            let baseDeDatos = [
                {
                    id: 1,
                    nombre: 'Patata',
                    precio: 1,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 2,
                    nombre: 'Cebolla',
                    precio: 1.2,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 3,
                    nombre: 'Calabacin',
                    precio: 2.1,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 4,
                    nombre: 'Fresas',
                    precio: 0.6,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 5,
                    nombre: 'yohel',
                    precio: 0.6,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 6,
                    nombre: 'adriana',
                    precio: 0.6,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 7,
                    nombre: 'ale',
                    precio: 0.6,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 8,
                    nombre: 'penia',
                    precio: 0.6,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 9,
                    nombre: 'carlos',
                    precio: 0.6,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 10,
                    nombre: 'profe playo',
                    precio: 0.6,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                },
                {
                    id: 11,
                    nombre: 'el ultimo',
                    precio: 0.6,
                    imagen: 'img/hotel-ibis-hermosillo.jpg'
                }

            ]
            let $items = document.querySelector('#items');
            // Funciones
            function renderItems () {
                for (let info of baseDeDatos) {
                    // Estructura
                    let miNodo = document.createElement('div');
                    miNodo.classList.add('card', 'col-sm-4');
                    // Body
                    let miNodoCardBody = document.createElement('div');
                    miNodoCardBody.classList.add('card-body');
                    //imagen
                    let miNodoImagen = document.createElement('img');
                    miNodoImagen.classList.add('card-img');
                    miNodoImagen.alt = info['nombre'];
                    miNodoImagen.src = info['imagen'];

                    // Titulo
                    let miNodoTitle = document.createElement('h5');
                    miNodoTitle.classList.add('card-title');
                    miNodoTitle.textContent = info['nombre'];
                    // Precio
                    let miNodoPrecio = document.createElement('p');
                    miNodoPrecio.classList.add('card-text');
                    miNodoPrecio.textContent = info['precio'] + '€';
                    // Boton
                    let miNodoBoton = document.createElement('button');
                    miNodoBoton.classList.add('btn', 'btn-primary');
                    miNodoBoton.textContent = 'ver más';
                    miNodoBoton.setAttribute('marcador', info['id']);
                    miNodoBoton.addEventListener('click', function (event) {
                                let num = this.getAttribute('marcador');
                                
                                window.location = 'hotelVista.html?numero='+num;
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


            // Inicio
            renderItems();
        }
        
    </script>







</head>
<body>
<div class="container">
    <form>
        <div class="header">
            <img class="img"  src="img/logo.jpeg" style="border-radius: 50px">
            <h1 style="font-family: 'Alata';font-size: 40px">BIENVENIDO A HAPPYTRIP</h1>
        </div  >

            <div class="barra">
                <button  class="btn btn-primary" style=" background-color: #74818A; border-color: #74818A; font-family: 'Alata';font-size: 18px;margin-bottom: 4px" >Buscar</button>
                <input type="text" name="search" placeholder="Search.." style="font-family: 'Alata';font-size: 18px">
                <a href="#" style="font-family: 'Alata';font-size: 18px">Reservaciones</a>
                <a href="#" style="font-family: 'Alata';font-size: 18px">Ayuda</a>
            </div>


            <div class="slider" style="margin-top: 10px ">
                <ul>
                    <li><img src="img/imagen1.jpg" alt=""></li>
                    <li><img src="img/imagen2.jpg" alt=""></li>
                    <li><img src="img/imagen3.jpg" alt=""></li>
                    <li><img src="img/imagen5.jpg" alt=""></li>

                </ul>
            </div>

    </form>

    <div style="margin-top: 10px">
        <div class="container-fluid">
            <div class="row">
                <!-- Elementos generados a partir del JSON -->
                <main id="items" class="col-sm-13 row"></main>


            </div>
        </div>


    </div>





</div>


</body>

</html>

