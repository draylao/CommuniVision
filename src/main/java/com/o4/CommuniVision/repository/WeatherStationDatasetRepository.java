package com.o4.CommuniVision.repository;

import com.o4.CommuniVision.model.entity.WeatherStationDataset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherStationDatasetRepository extends JpaRepository<WeatherStationDataset, Integer> {
    List<WeatherStationDataset> findByOrganizationId(Integer organizationId);
}
