package org.example.joblisting.Repository;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.joblisting.Model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SearchImplementation implements SearchRepository{

    @Autowired
    MongoClient client;

    @Autowired
    MongoConverter converter;

    @Override
    public List<Post> findByText(String text) {

        List<Post> posts = new ArrayList<>();

        MongoDatabase database = client.getDatabase("rohanjob");
        MongoCollection<Document> collection = database.getCollection("JobPost");

        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search", new Document("text", new Document("query", text)
                                .append("path", Arrays.asList("desc", "techs", "profile")))),
                new Document("$sort", new Document("exp", -1L)), new Document("$limit", 5L)));

        result.forEach(doc -> posts.add((Post) converter.read(Post.class, doc)));

        return posts;

    }
}
