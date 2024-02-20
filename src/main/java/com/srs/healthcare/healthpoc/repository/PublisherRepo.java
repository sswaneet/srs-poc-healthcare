package com.srs.healthcare.healthpoc.repository;

import com.srs.healthcare.healthpoc.model.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface PublisherRepo extends MongoRepository<Publisher, String> {
    }
