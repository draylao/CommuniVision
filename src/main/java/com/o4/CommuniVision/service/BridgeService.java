package com.o4.CommuniVision.service;

import com.o4.CommuniVision.model.entity.Bridge;
import com.o4.CommuniVision.repository.BridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BridgeService {

    @Autowired
    private BridgeRepository bridgeRepository;

    public Bridge createBridge(Bridge bridge) {
        return bridgeRepository.save(bridge);
    }

    public Bridge getBridgeById(Integer id) {
        Optional<Bridge> optionalBridge = bridgeRepository.findById(id);

        if (optionalBridge.isPresent()) {
            Bridge bridge = optionalBridge.get();
            return bridge;
        }

        return null;
    }

}
