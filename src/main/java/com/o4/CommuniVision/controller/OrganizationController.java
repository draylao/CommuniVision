package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.Organization;
import com.o4.CommuniVision.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("communivision/organizations")
public class OrganizationController {

    @Autowired
    public OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Organization organization) {
        return ResponseEntity.ok(organizationService.createOrganization(organization));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Integer id) {
        return ResponseEntity.ok(organizationService.getOrganizationById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Organization updatedOrg) {
        return ResponseEntity.ok(organizationService.updateOrganization(id, updatedOrg));
    }
}
