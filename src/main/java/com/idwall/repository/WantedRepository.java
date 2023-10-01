package com.idwall.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.idwall.domain.Wanted;

public interface WantedRepository extends JpaRepository{

	
	@Query("{ $and: [ {'familyName': { $regex: ?0, $options: 'i' } },"
				  + " {'firstName': { $regex: ?1, $options: 'i' } },"
				  + " {'nationality': { $regex: ?2, $options: 'i' } },"
				  + " {'gender': { $regex: ?3, $options: 'i' } },"
				  + " {'age': { $gte: ?4} },"
				  + " {'age': { $lte: ?5} },"
				  + " {'crime': { $regex: ?6, $options: 'i' } },"
				  + " {'wantedIn': { $regex: ?7, $options: 'i' } },"
				  + " {'description': { $regex: ?8, $options: 'i' } } "
				  + "] }")
	List<Wanted> fullSearch(String familyName, String firstName, String nationality, String gender, int minAge, int maxAge, String crime, String wantedIn, String description);
	
}
