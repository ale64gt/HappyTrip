/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesamiento;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
    
        public  boolean verificarCorreoElectronico(String correo){

        Pattern patronregex = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher bandera = patronregex.matcher(correo);

        return bandera.find();
    }
    public  boolean verificarFechaNacimiento(Date fechaN){

        Date fechaActual = new Date();

        int dias=(int) ((fechaActual.getTime()-fechaN.getTime())/86400000);
        int anios = dias/365;

        if(anios < 18){
            return false;
        }
        else {
            return true;
        }

    }
    public  boolean verificarTarjetaCredito(String tarjeta){



        Pattern patronTarjeta = Pattern.compile("^5[1-5][0-9]{14}$");

        Matcher bandera = patronTarjeta.matcher(tarjeta);

        return bandera.find();




    }

    
}
