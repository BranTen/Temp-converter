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
public class Farenheight extends Temperature {

    double temp;
    public Farenheight(double temp) {
        super(temp);
        this.temp = temp;
    }
    public boolean aboveBoiling(){
        return getTemp() >212;
    }
    public boolean belowFreezing(){
        return getTemp() < 32;
    }    
    public double diff(Temperature temp)throws  IncompatibleTempScaleException{
        if(!(temp instanceof Farenheight)){
            throw new  IncompatibleTempScaleException();
        }
        return Math.abs( getTemp() - temp.getTemp());
    }
    
    public double convertToFarenheight(){
        return getTemp();
    }
    public double convertToCelcius(){
        return (getTemp()-32.0) * (5/9);
    }
        public double convertToKelvin(){
        return (getTemp() +459.67) * (5/9);
    }
    
    
}
