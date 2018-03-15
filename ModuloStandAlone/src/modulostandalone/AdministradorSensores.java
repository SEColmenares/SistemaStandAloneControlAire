/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulostandalone;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author sergio_colmenares
 */
public class AdministradorSensores {
    
    private List<Sensor> listaSensores = new ArrayList<Sensor>();
    
    public AdministradorSensores(){
    
    }
    
    public void DetectarSensores()
    {
        // aqui va el metodo de control para detectar cada sensor
        // por ahora se supone que se detectaron y se incializan        
       
        Sensor sensortemperatura = new Sensor("Sensor Temperatura");
        listaSensores.add(sensortemperatura);
        Sensor sensorCO2 = new Sensor("Sensor CO2");
        listaSensores.add(sensorCO2);
        Sensor sensorRuido = new Sensor("Sensor de Rudio");
        listaSensores.add(sensorRuido);
        Sensor sensorHumedad = new Sensor("Sensor de Humedad");
        listaSensores.add(sensorHumedad);
        
    }
    
}
