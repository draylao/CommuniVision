package com.o4.CommuniVision.service;

import com.o4.CommuniVision.model.entity.WeatherStation;
import com.o4.CommuniVision.repository.WeatherStationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class WeatherStationService {
    @Autowired
    private WeatherStationRepository repository;

    public WeatherStation createWeatherStation(WeatherStation station){
        return repository.save(station);
    }

    public WeatherStation getWeatherStationById(Integer id){
        Optional<WeatherStation>optionalWeatherStation = repository.findById(id);

        if(optionalWeatherStation.isPresent()){
            WeatherStation station = optionalWeatherStation.get();
            return station;
        }
        return null;
    }



}
