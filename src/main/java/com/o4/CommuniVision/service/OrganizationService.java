package com.o4.CommuniVision.service;

import com.o4.CommuniVision.model.entity.Organization;
import com.o4.CommuniVision.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public Organization getOrganizationById(Integer id) {
        Optional<Organization> optionalOrganization = organizationRepository.findById(id);

        if (optionalOrganization.isPresent()) {
            Organization organization = optionalOrganization.get();
            return organization;
        }
        return null;
    }

    public Organization updateOrganization(Integer id, Organization updatedOrg) {
        Optional<Organization> optionalOrganization = organizationRepository.findById(id);

        if (optionalOrganization.isPresent()) {
            Organization existingOrg = optionalOrganization.get();
            existingOrg.setName(updatedOrg.getName());
            return organizationRepository.save(existingOrg);
        }
        return null;
    }




}
