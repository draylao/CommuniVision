package com.o4.CommuniVision.service;

import com.o4.CommuniVision.model.entity.Organization;
import com.o4.CommuniVision.repository.OrganizationRepository;
import com.o4.CommuniVision.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.o4.CommuniVision.model.dto.Signup;
import com.o4.CommuniVision.model.dto.Login;
import com.o4.CommuniVision.model.entity.User;
import java.util.Map;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRep;

    @Autowired
    private OrganizationRepository organizationRepository;

    public String register(Signup req, Integer organizationId){
        String email = req.getEmail();
        if (userRep.findUserByEmail(email).isPresent()) {
            return "Email in Use";
        }

        User user = new User();
        user.setEmail(email);
        user.setName(req.getName());
        user.setPassword(req.getPassword());

        Organization organization = organizationRepository.findById(organizationId)
                        .orElseThrow(() -> new RuntimeException("Organization not found"));

        user.setOrganization(organization);

        userRep.save(user);
        return "Registration Successful";

    }

    public boolean login(Login req){
        Optional<User> haveAcc = userRep.findUserByEmail(req.getEmail());
        return haveAcc.isPresent() && haveAcc.get().getPassword().equals(req.getPassword());
    }

    public List<User> getAllUsers() {
        return userRep.findAll();
    }

    public List<User> getUsersByOrganization(Integer organizationId) {
        return userRep.findByOrganizationId(organizationId);
    }

    public ResponseEntity<?> updateUser (Signup req, Integer id) {
        try {
            Optional<User> optionalExisting = userRep.findById(id);
            if (optionalExisting.isEmpty()) {
                return ResponseEntity.notFound().build();
            }

            User existing = optionalExisting.get();
            if (req.getName() != null) {
                existing.setName(req.getName());
            }
            if (req.getEmail() != null) {
                existing.setEmail(req.getEmail());
            }
            if (req.getPassword() != null) {
                existing.setPassword(req.getPassword());
            }

            userRep.save(existing);

            return ResponseEntity.ok(Map.of("success", true));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("success", false, "error", e.getMessage()));
        }
    }

    @Transactional
    public ResponseEntity<?> deleteUser(Integer id) {
        try{
            Optional<User> optionalExisting = userRep.findById(id);
            if (optionalExisting.isEmpty()) {
                return ResponseEntity.notFound().build();
            }

            userRep.deleteById(id);

            return ResponseEntity.ok(Map.of("Success", true, "message", "User deleted successfully"));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("Success", false, "Error", e.getMessage()));
        }
    }
}
