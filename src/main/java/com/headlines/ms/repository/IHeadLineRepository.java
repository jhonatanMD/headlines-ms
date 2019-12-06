package com.headlines.ms.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.headlines.ms.model.HeadLineEntity;
@Repository
public interface IHeadLineRepository extends ReactiveMongoRepository<HeadLineEntity,String>{

}
