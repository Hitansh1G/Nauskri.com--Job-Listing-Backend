package com.example.jobListing.Repository;

import com.example.jobListing.Model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
