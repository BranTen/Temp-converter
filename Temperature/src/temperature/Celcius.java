/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

/**
 *
 * @author Brandon
 */
public class Celcius extends Temperature {
double temp;
    public Celcius(double temp) {
        super(temp);
        this.temp = temp;
    }
        public boolean aboveBoiling(){
        return getTemp() >100;
    }
        public boolean belowFreezing(){
        return getTemp() < 0;
    } 
    public double diff(Temperature temp)throws  IncompatibleTempScaleException{
        if(!(temp instanceof Celcius)){
            throw new  IncompatibleTempScaleException();
        }
        return Math.abs( getTemp() - temp.getTemp());
    }
        public double convertToFarenheight(){
        return (getTemp() * (9/5)) + 32;
    }
    public double convertToCelcius(){
        return getTemp();
    }
        public double convertToKelvin(){
        return getTemp() + 273.15;
    }
    
}
