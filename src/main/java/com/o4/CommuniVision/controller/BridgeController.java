package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.Bridge;
import com.o4.CommuniVision.service.BridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
@RequestMapping("communivision/bridges")
public class BridgeController {

    @Autowired
    private BridgeService bridgeService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Bridge bridge) {
        return ResponseEntity.ok(bridgeService.createBridge(bridge));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id) {
        return ResponseEntity.ok(bridgeService.getBridgeById(id));
    }
}
