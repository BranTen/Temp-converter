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
public class Kelvin extends Temperature {
double temp;
    public Kelvin(double temp) {
        super(temp);
        this.temp = temp;
    }
        public boolean aboveBoiling(){
        return getTemp() >373.15;
    }
        public boolean belowFreezing(){
        return getTemp() < 273.15;
    } 
    public double diff(Temperature temp)throws  IncompatibleTempScaleException{
        if(!(temp instanceof Kelvin)){
            throw new  IncompatibleTempScaleException();
        }
        return Math.abs( getTemp() - temp.getTemp());
    }
        public double convertToFarenheight(){
        return ((9/5) * (getTemp()-273))+32;
    }
        public double convertToCelcius(){
        return getTemp() - 273.15;
    }
        public double convertToKelvin(){
        return getTemp();
    }
    
}
