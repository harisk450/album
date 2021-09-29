package com.example.album.Repository;

import com.example.album.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {
    List<User> findUserByName(String name);
}
