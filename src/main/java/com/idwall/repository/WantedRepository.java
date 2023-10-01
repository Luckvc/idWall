package com.idwall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.Query;

import com.idwall.domain.WantedFBI;

public interface WantedRepository extends JpaRepository<WantedFBI, Long>{

	
	@Query("{ $and: [ {'familyName': { $regex: ?0, $options: 'i' } },"
				  + " {'firstName': { $regex: ?1, $options: 'i' } },"
				  + " {'nationality': { $regex: ?2, $options: 'i' } },"
				  + " {'gender': { $regex: ?3, $options: 'i' } },"
				  + " {'crime': { $regex: ?4, $options: 'i' } },"
				  + " {'wantedIn': { $regex: ?5, $options: 'i' } },"
				  + "] }")
	List<WantedFBI> fullSearch(String familyName, String firstName, String nationality, String gender, String crime, String wantedIn);
	
}
