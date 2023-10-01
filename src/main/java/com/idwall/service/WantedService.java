package com.idwall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idwall.domain.Wanted;
import com.idwall.repository.WantedRepository;

@Service
public class WantedService {
	
	
	@Autowired
	private WantedRepository repo;

	public List<Wanted> fullSearch(String familyName, String firstName, String nationality, String gender, int minAge, int maxAge, String crime, String wantedIn, String description  ) {
		return repo.fullSearch(familyName, firstName, nationality, gender, minAge, maxAge, crime, wantedIn, description);
		
	}
	

	
}
