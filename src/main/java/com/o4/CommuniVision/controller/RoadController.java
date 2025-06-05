package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.Road;
import com.o4.CommuniVision.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("communivision/roads")
public class RoadController {

    @Autowired
    private RoadService roadService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Road road) {
        return ResponseEntity.ok(roadService.createRoad(road));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id) {
        return ResponseEntity.ok(roadService.getRoadById(id));
    }

}
