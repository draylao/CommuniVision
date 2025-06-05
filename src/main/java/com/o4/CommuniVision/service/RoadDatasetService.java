package com.o4.CommuniVision.service;

import com.o4.CommuniVision.model.entity.RoadDataset;
import com.o4.CommuniVision.repository.RoadDatasetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoadDatasetService {
    @Autowired
    private RoadDatasetRepository roadDatasetRepository;

    @Autowired
    private OrganizationService organizationService;

    public RoadDataset createDataset(RoadDataset roadDataset) {
        return roadDatasetRepository.save(roadDataset);
    }

    public RoadDataset getDatasetById(Integer id) {
        Optional<RoadDataset> optionalRoadDataset = roadDatasetRepository.findById(id);

        if (optionalRoadDataset.isPresent()) {
            RoadDataset roadDataset = optionalRoadDataset.get();
            return roadDataset;
        }

        return null;
    }
}
