package com.o4.CommuniVision.model.entity;

import com.o4.CommuniVision.model.enums.RiskLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "weather_stations")
public class WeatherStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @Column(name = "temperature", nullable = false)
    private Double temperature;

    @Column(name = "rain", nullable = false)
    private int rain;

    @Column(name = "wind", nullable = false)
    private int wind;

    @Column(name = "humidity", nullable = false)
    private int humidity;

    @Column(name = "risk_level", nullable = false)
    @Enumerated(EnumType.STRING)
    private RiskLevel riskLevel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dataset_id")
    private WeatherStationDataset weatherStationDataset;

}
