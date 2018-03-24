
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Engineer Melkam Beyu
 */
public class WeatherStation implements Subject{
    private int pressure;
    private int tempreture;
    private int humidity;
    private List <Observer> ObserverList;
    
    public WeatherStation(){
        this.ObserverList=new ArrayList();
    }

    public void addObserver(Observer o) {
        this.ObserverList.add(o);
      }

    public void removeObserver(Observer o) {
        this.ObserverList.remove(o);
        
       }

    public void notifyAllObserver() {
       for(Observer observer:this.ObserverList){
           observer.update(pressure, tempreture, humidity);
       }
       }
    public void setPressure(int pressure){
        this.pressure=pressure;
        notifyAllObserver();
        
    }
    public void setTempreture(int tempreture){
        this.tempreture=tempreture;
         notifyAllObserver();
    }
    public void setHumidity(int humidity){
        this.humidity=humidity;
         notifyAllObserver();
    }

    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
