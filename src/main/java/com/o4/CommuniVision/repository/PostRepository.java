package com.o4.CommuniVision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.o4.CommuniVision.model.entity.Post;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
