package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.RoadDataset;
import com.o4.CommuniVision.service.RoadDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("communivision/roaddatasets")
public class RoadDatasetController {

    @Autowired
    private RoadDatasetService roadDatasetService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RoadDataset roadDataset) {
        return ResponseEntity.ok(roadDatasetService.createDataset(roadDataset));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id) {
        return ResponseEntity.ok(roadDatasetService.getDatasetsByOrganizationId(id));
    }

    @GetMapping("organization/{organizationId}")
    public ResponseEntity<?> getDatasetsByOrganization(Integer organizationId) {
        return ResponseEntity.ok(roadDatasetService.getDatasetsByOrganizationId(organizationId));
    }
}
