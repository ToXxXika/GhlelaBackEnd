package com.example.demo.Repositories;

import com.example.demo.Documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}