
package com.example.weather.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
public class WeatherEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String requestedCityName;
    private String country;
    private String cityName;
    private Integer temperature;
    private LocalDateTime updatedTime;
    private LocalDateTime responseLocalTime;

    public String getId() {
        return id;
    }

    public String getRequestedCityName() {
        return requestedCityName;
    }

    public String getCountry() {
        return country;
    }

    public String getCityName() {
        return cityName;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public LocalDateTime getResponseLocalTime() {
        return responseLocalTime;
    }

    public WeatherEntity(String id, String requestedCityName, String country, String cityName, Integer temperature, LocalDateTime updatedTime, LocalDateTime responseLocalTime) {
        this.id = id;
        this.requestedCityName = requestedCityName;
        this.country = country;
        this.cityName = cityName;
        this.temperature = temperature;
        this.updatedTime = updatedTime;
        this.responseLocalTime = responseLocalTime;
    }
    public WeatherEntity(String requestedCityName, String country, String cityName, Integer temperature, LocalDateTime updatedTime, LocalDateTime responseLocalTime) {
        this.id = "";
        this.requestedCityName = requestedCityName;
        this.country = country;
        this.cityName = cityName;
        this.temperature = temperature;
        this.updatedTime = updatedTime;
        this.responseLocalTime = responseLocalTime;
    }
    public WeatherEntity(){}

}
