package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.WeatherStationDataset;
import com.o4.CommuniVision.service.WeatherStationDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("communivision/weatherdatasets")
public class WeatherStationDatasetController {

    @Autowired
    private WeatherStationDatasetService weatherStationDatasetService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody WeatherStationDataset weatherStationDataset) {
        return ResponseEntity.ok(weatherStationDatasetService.createWeatherDataset(weatherStationDataset));
    }

    @GetMapping("/organization/{organizationId}")
    public ResponseEntity<?> getDatasetsByOrganization(@PathVariable Integer organizationId) {
        return ResponseEntity.ok(weatherStationDatasetService.getDatasetsByOrganizationId(organizationId));
    }

}
