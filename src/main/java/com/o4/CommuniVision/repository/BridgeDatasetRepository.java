package com.o4.CommuniVision.repository;

import com.o4.CommuniVision.model.entity.BridgeDataset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BridgeDatasetRepository extends JpaRepository<BridgeDataset, Integer> {
    List<BridgeDataset> findByOrganizationId(Integer organizationId);
}
