package org.example.joblisting.Controller;


import org.example.joblisting.Model.Post;
import org.example.joblisting.Repository.PostRepository;
import org.example.joblisting.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("allPosts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping("posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){

        return srepo.findByText(text);
    }

    @PostMapping("Posts")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
         return repo.save(post);
    }



}
