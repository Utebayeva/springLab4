package com.example.demo.post;

import com.example.demo.location.Location;
import com.example.demo.user.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    User user1 = new User(
            "u1",
            "Jany",
            "Lawrence",
            new Location("l1", "Astana"),
            "Jany@gmail.com"
    );

    User user2 = new User(
            "u2",
            "Jadon",
            "Mills",
            new Location("l2", "Almaty"),
            "Jadon@gmail.com"
    );

    com.example.demo.post.Post post1 = new com.example.demo.post.Post(
            "p1",
            "01-Jan-19",
            user1,
            "Its good to love and be loved"
    );

    com.example.demo.post.Post post2 = new com.example.demo.post.Post(
            "p2",
            "02-Jan-19",
            user2,
            "We all need someone"
    );

    List<com.example.demo.post.Post> posts = Arrays.asList(post1, post2);
    public List<com.example.demo.post.Post> getAllPosts() {
        return posts;
    }
}
