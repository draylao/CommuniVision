package com.o4.CommuniVision.repository;

import com.o4.CommuniVision.model.entity.RoadDataset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoadDatasetRepository extends JpaRepository<RoadDataset, Integer> {
    List<RoadDataset> findByOrganizationId(Integer organizationId);
}
