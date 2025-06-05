package com.o4.CommuniVision.service;
import com.o4.CommuniVision.model.entity.Comment;
import com.o4.CommuniVision.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CommentService {

    private CommentRepository repository;

    @Autowired
    public CommentService(CommentRepository repository){
        this.repository = repository;
    }

    public Comment createComment(Comment comment){
        comment.setTime(LocalDateTime.now());
        return repository.save(comment);
    }

    public Optional<Comment> getComment (Integer id){
        return repository.findById(id);
    }


}
