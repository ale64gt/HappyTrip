<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    


	<head>
            
                <link href="Reservacion.css" rel="stylesheet" type="text/css"/>
                                <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Realizar Reservacion</title>
            <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        
            <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
            <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
            <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>
	</head>
        

	<body >
            <div class="container" >
                <div class="Registrar" >
                    <h1 style="padding-top:10px; text-align: center; width: 100%;"> Reservar Habitacion </h1>
                     <form  >
                        
                         <label> Nombre Completo: <input type="texts" name="nc"/><br> </label>
                          
                            
                        <label for="datepicker">Fecha de Nacimiento:</label>
                               <input type="texts" name="fecha" id="datepicker">
                        <label> Correo Electronico: 
                               <input type="texts" name="cor"/> </label>

                        <h1> Informacion de la Tarjeta </h1>

                        <label> Numero de la Tarjeta:
                               <input type="texts" name="numt"/> </label>             

                        <button onclick="clicked();" type="submit" name="conf">Confirmar</button>
                        <script type="text/javascript">
                            function clicked() {
                                if (confirm('Desea confirmar su reservacion')) {
                                   
                                    window.close();
                                    
                                        //document.getElementsByName("conf")().submit();
                                } else {
                                    return false;
                                    }
                            }

</script>

                    </form>
                </div>
            </div>
            
	</body>
</html>

