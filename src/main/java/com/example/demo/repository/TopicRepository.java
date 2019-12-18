package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long>{

	//@Query("SELECT t FROM Topic t LIMIT 15")
	//List<Topic> findTop15ByOrderById();
	
	@Query("SELECT t FROM Topic t WHERE t.title LIKE %:title%")
    List<Topic> findByTitle(String title);
}
