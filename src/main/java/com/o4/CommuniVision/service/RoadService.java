package com.o4.CommuniVision.service;

import com.o4.CommuniVision.model.entity.Road;
import com.o4.CommuniVision.repository.RoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoadService {

    @Autowired
    private RoadRepository roadRepository;

    public Road createRoad(Road road) {
        return roadRepository.save(road);
    }

    public Road getRoadById(Integer id) {
        Optional<Road> optionalRoad = roadRepository.findById(id);

        if (optionalRoad.isPresent()) {
            Road road = optionalRoad.get();
            return road;
        }

        return null;
    }

}
