package com.example.chat.repository;

import com.example.chat.entity.ChatDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ChatMongoRepository extends ReactiveMongoRepository<ChatDocument, ObjectId> {
}
