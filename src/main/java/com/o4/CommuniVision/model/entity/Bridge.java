package com.o4.CommuniVision.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.o4.CommuniVision.model.enums.Condition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bridges")
public class Bridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "latitude", nullable = false)
    private double latitude;

    @Column(name = "longitude", nullable = false)
    private double longitude;

    @Enumerated(EnumType.STRING)
    @Column(name = "bridge_condition", nullable = false)
    private Condition condition;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "traffic", nullable = false)
    private int traffic;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dataset_id", nullable = false)
    private BridgeDataset bridgeDataset;

}
