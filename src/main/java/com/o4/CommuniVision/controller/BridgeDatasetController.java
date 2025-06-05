package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.BridgeDataset;
import com.o4.CommuniVision.service.BridgeDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("communivision/bridgedatasets")
public class BridgeDatasetController {

    @Autowired
    private BridgeDatasetService bridgeDatasetService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody BridgeDataset bridgeDataset) {
        return ResponseEntity.ok(bridgeDatasetService.createDataset(bridgeDataset));
    }

    

}
