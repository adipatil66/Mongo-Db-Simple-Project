package com.mongo.entity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface productRepo extends MongoRepository<product, String> {

}
