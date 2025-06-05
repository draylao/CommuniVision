package com.o4.CommuniVision.controller;

import com.o4.CommuniVision.model.entity.Post;
import com.o4.CommuniVision.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/communivision/posts")
public class PostController {

    @Autowired
    public PostService postService;

    @PostMapping
    public ResponseEntity<?> createPost (@RequestBody Post post) {
        return ResponseEntity.ok(postService.createPost(post));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPost (@PathVariable Integer id) {
        return ResponseEntity.ok(postService.getPost(id));
    }
}
