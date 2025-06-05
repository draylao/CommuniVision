package com.o4.CommuniVision.repository;

import com.o4.CommuniVision.model.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
