package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.BridgeDataset;
import com.o4.CommuniVision.service.BridgeDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("communivision/bridgedatasets")
public class BridgeDatasetController {

    @Autowired
    private BridgeDatasetService bridgeDatasetService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody BridgeDataset bridgeDataset) {
        return ResponseEntity.ok(bridgeDatasetService.createDataset(bridgeDataset));
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<?> get(@PathVariable Integer id) {
//        return ResponseEntity.ok(bridgeDatasetService.getDatasetById(id));
//    }

    @GetMapping("organization/{organizationId}")
    public ResponseEntity<?> getDatasetsByOrganization(@PathVariable Integer organizationId) {
        return ResponseEntity.ok(bridgeDatasetService.getDatasetsByOrganization(organizationId));
    }

}
