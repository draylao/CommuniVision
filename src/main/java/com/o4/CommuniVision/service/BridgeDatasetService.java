package com.o4.CommuniVision.service;

import com.o4.CommuniVision.model.entity.BridgeDataset;
import com.o4.CommuniVision.model.entity.Organization;
import com.o4.CommuniVision.repository.BridgeDatasetRepository;
import com.o4.CommuniVision.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BridgeDatasetService {

    @Autowired
    private BridgeDatasetRepository bridgeDatasetRepository;

    public BridgeDataset createDataset(BridgeDataset bridgeDataset) {
        return bridgeDatasetRepository.save(bridgeDataset);
    }

//    public BridgeDataset getDatasetById(Integer id) {
//        Optional<BridgeDataset> optionalBridgeDataset = bridgeDatasetRepository.findById(id);
//
//        if (optionalBridgeDataset.isPresent()) {
//            BridgeDataset bridgeDataset = optionalBridgeDataset.get();
//            return bridgeDataset;
//        }
//
//        return null;
//    }

    public List<BridgeDataset> getDatasetsByOrganization(Integer orgId) {
        return bridgeDatasetRepository.findByOrganizationId(orgId);
    }

}
