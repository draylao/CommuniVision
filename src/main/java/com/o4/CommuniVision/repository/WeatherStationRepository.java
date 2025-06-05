package com.o4.CommuniVision.repository;

import com.o4.CommuniVision.model.entity.WeatherStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherStationRepository extends JpaRepository <WeatherStation, Integer> {
}
