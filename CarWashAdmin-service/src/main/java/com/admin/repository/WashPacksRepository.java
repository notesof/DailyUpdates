package com.admin.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.admin.models.WashPacks;


@Repository
public interface WashPacksRepository extends MongoRepository<WashPacks, Integer> {

	public Optional<WashPacks> findByPackname(String packname);
	
}
