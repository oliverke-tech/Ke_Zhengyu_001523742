/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class VitalSigns {
 
    private int rate;
    private int heart;
    private int pressure;
    private float kilos;
    private float pounds;

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    public int getRate() {
        return rate;
    }
    
    public void setHeart(int heart) {
        this.heart = heart;
    }
    
    public int getHeart() {
        return heart;
    }
    
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    
    public int getPressure() {
        return pressure;
    }
    
    public void setKilos(float kilos) {
        this.kilos = kilos;
    }
    
    public float getKilos() {
        return kilos;
    }
    
    public void setPounds(float pounds) {
        this.pounds = pounds;
    }
    
    public float getPounds() {
        return pounds;
    }
    
    public VitalSigns(int rate, int heart, int pressure, float kilos, float pounds){
        this.rate = rate;
        this.heart = heart;
        this.pressure = pressure;
        this.kilos = kilos;
        this.pounds = pounds;
    }
}
