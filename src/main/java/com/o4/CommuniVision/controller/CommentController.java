package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.Comment;
import com.o4.CommuniVision.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/communivision/posts/comment")
public class CommentController {

    @Autowired
    public CommentService commentService;

    @PostMapping
    public ResponseEntity<?> createComment (@RequestBody Comment comment) {
        return ResponseEntity.ok(commentService.createComment(comment));
    }

    @GetMapping
    public ResponseEntity<?> getComment (@PathVariable Integer id) {
        return ResponseEntity.ok(commentService.getComment(id));
    }
}
