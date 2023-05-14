package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Long> {
	
//	Admin findByUsername(String username);
//	void save(org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin admin);

}
