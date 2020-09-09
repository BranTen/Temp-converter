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
public abstract class Temperature {
        private double temp;
        
    public Temperature(double temp){
        this.temp = temp;
    }
    public double getTemp(){
        return temp;
    }
    public abstract double diff(Temperature otherTemp) throws  IncompatibleTempScaleException;

    public abstract boolean aboveBoiling();

    public abstract boolean belowFreezing();
    
    public abstract double convertToFarenheight();
    
    public abstract double convertToCelcius();
    
    public abstract double convertToKelvin();
        
    
}
