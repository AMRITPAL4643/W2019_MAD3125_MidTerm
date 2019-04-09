package com.midtermmad3125.ui;

import com.midtermmad3125.Modal.Temperature;
import com.midtermmad3125.Modal.Wheather;

import java.io.Serializable;

public class WheatherList implements Serializable {

    private Integer dt;
    private Temperature temp;
    private Double pressure;
    private Integer humidity;
    private  Wheather cityweather;
    private Double speed;
    private Integer deg;
    private Integer clouds;
    private Double rain;

    public WheatherList(Integer dt, Temperature temp, Double pressure, Integer humidity, Wheather cityweather, Double speed, Integer deg, Integer clouds, Double rain) {
        this.dt = dt;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.cityweather = cityweather;
        this.speed = speed;
        this.deg = deg;
        this.clouds = clouds;
        this.rain = rain;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Wheather getCityweather() {
        return cityweather;
    }

    public void setCityweather(Wheather cityweather) {
        this.cityweather = cityweather;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }
}