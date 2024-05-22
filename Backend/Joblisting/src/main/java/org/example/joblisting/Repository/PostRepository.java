package org.example.joblisting.Repository;

import org.example.joblisting.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

//@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
