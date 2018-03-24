/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Engineer Melkam Beyu
 */
public class WeatherObserver implements Observer,DataPresenter {
    private int pressure;
    private int tempreture;
    private int humidity;
    private Subject subject;
    
    public WeatherObserver(Subject subject){
        this.subject=subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int tempreture, int humidity) {
       this.pressure=pressure;
       this.tempreture=tempreture;
       this.humidity=humidity;
       showData();  
    }
    
    public void showData(){
        System.out.println("---------------------------------------------");
        System.out.println("--------NOTIFICATION of Weather-------------");
        System.out.println("---------------------------------------------");
        
        System.out.println("The Presssurre is "+"  "+this.pressure);
        System.out.println("The Tempriture is "+"  "+this.tempreture);
        System.out.println("The Humidity is "+"  "+this.humidity);
    }
}
