package com.o4.CommuniVision.service;
import com.o4.CommuniVision.model.entity.Post;
import com.o4.CommuniVision.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository repository;

    @Autowired
    public PostService(PostRepository repository){
        this.repository = repository;
    }

    public Post createPost(Post post){
        post.setTime(LocalDateTime.now());
        return repository.save(post);
    }

    public Optional<Post> getPost (Integer id){
        return repository.findById(id);
    }


}
