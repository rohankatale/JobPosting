package org.example.joblisting.Repository;

import org.example.joblisting.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SearchRepository  {

    List<Post> findByText(String text);
}
