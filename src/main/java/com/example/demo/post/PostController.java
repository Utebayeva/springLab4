package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private com.example.demo.post.PostService postService;

    @RequestMapping(value = "/posts")
    public List<com.example.demo.post.Post> getAllPosts() {
        return postService.getAllPosts();
    }
}
