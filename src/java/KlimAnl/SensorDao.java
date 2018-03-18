
package KlimAnl;

import java.util.ArrayList;
import java.util.List;


public class SensorDao {
    public List<Sensor> getAllTemperaturSensors () {
        List<Sensor> temperatur = new ArrayList<>();
        
        Sensor t1 = new Sensor("Temperatur", 15);
        Sensor t2 = new Sensor("Temperatur", 16);
        Sensor t3 = new Sensor("Temperatur", 17);
        Sensor t4 = new Sensor("Temperatur", 18);
        Sensor t5 = new Sensor("Temperatur", 19);
    
        temperatur.add(t1);
        temperatur.add(t2);
        temperatur.add(t3);
        temperatur.add(t4);
        temperatur.add(t5);
    return temperatur;
    
    }
    public List<Sensor> getAllHumiditySensors () {
        List<Sensor> humidity = new ArrayList<>();
        
        Sensor t1 = new Sensor("Humidity", 81);
        Sensor t2 = new Sensor("Humidity", 82);
        Sensor t3 = new Sensor("Humidity", 83);
        Sensor t4 = new Sensor("Humidity", 84);
        Sensor t5 = new Sensor("Humidity", 85);
    
        humidity.add(t1);
        humidity.add(t2);
        humidity.add(t3);
        humidity.add(t4);
        humidity.add(t5);
    return humidity;
    }
        public List<Sensor> getAllLamps () {
        List<Sensor> light = new ArrayList<>();
        
        Sensor t1 = new Sensor("Light", 100);
        Sensor t2 = new Sensor("Light", 100);
        Sensor t3 = new Sensor("Light", 100);
        Sensor t4 = new Sensor("Light", 100);
        Sensor t5 = new Sensor("Light", 0);
    
        light.add(t1);
        light.add(t2);
        light.add(t3);
        light.add(t4);
        light.add(t5);
    return light;
   }
    
    
    
}
