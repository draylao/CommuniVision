package com.o4.CommuniVision.service;

import com.o4.CommuniVision.model.entity.WeatherStationDataset;
import com.o4.CommuniVision.repository.WeatherStationDatasetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WeatherDatasetService {
    @Autowired
    private WeatherStationDatasetRepository weatherDatasetRepository;

    public WeatherStationDataset createWeatherDataset(WeatherStationDataset weatherStationDataset) {
        return weatherDatasetRepository.save(weatherStationDataset);
    }

    public List<WeatherStationDataset> getDatasetsByOrganizationId(Integer orgId) {
        return weatherDatasetRepository.findByOrganizationId(orgId);
    }

}
