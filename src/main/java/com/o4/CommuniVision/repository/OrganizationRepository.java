package com.o4.CommuniVision.repository;

import com.o4.CommuniVision.model.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganizationRepository  extends JpaRepository<Organization, Integer> {

}
