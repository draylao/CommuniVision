package com.o4.CommuniVision.model.entity;

import com.o4.CommuniVision.model.enums.Condition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "roads")
@NoArgsConstructor
@AllArgsConstructor
public class Road {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "latitude", nullable = false)
    private double latitude;

    @Column(name = "longitude", nullable = false)
    private double longitude;

    @Column(name = "road_condition", nullable = false)
    @Enumerated(EnumType.STRING)
    private Condition road_condition;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "region", nullable = false)
    private String region;

    @ManyToOne
    @JoinColumn(name = "dataset_id", nullable = false)
    private RoadDataset roadDataset;

}
