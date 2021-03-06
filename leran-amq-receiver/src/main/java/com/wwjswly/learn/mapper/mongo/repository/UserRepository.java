package com.wwjswly.learn.mapper.mongo.repository;

import com.wwjswly.learn.entity.TUser;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author jack
 */
public interface UserRepository extends MongoRepository<TUser, Long> {
}
