package com.techlineafrica.repositories;

import com.techlineafrica.entities.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
