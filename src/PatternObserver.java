/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Engineer Melkam Beyu
 */
public class PatternObserver {
    public static void main(String[] args){
        WeatherStation station= new WeatherStation();
        WeatherObserver weatherobserver=new WeatherObserver(station);
        station.setPressure(2000);
        station.setHumidity(100);
        station.setHumidity(300);
        
    }
}
