package com.o4.CommuniVision.controller;
import com.o4.CommuniVision.model.entity.WeatherStation;
import com.o4.CommuniVision.service.WeatherStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/communivision/weatherstations")
public class WeatherStationController {

    @Autowired
    private WeatherStationService weatherStationService;

    @PostMapping
    public ResponseEntity<?> createWeatherStation(@RequestBody WeatherStation station){
        return ResponseEntity.ok(weatherStationService.createWeatherStation(station));
    }

    @GetMapping
    public ResponseEntity<?> getWeatherStationById(@PathVariable Integer id) {
        return ResponseEntity.ok(weatherStationService.getWeatherStationById(id));
    }
}
