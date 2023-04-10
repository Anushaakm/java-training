package com.anu.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anu.crud.domain.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
    
}