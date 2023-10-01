package com.idwall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idwall.domain.WantedFBI;
import com.idwall.repository.WantedRepository;

@Service
public class WantedService {
	
	
	@Autowired
	private WantedRepository repo;

	public List<WantedFBI> fullSearch(String familyName, String firstName, String nationality, String gender, String crime, String wantedIn) {
		return repo.fullSearch(familyName, firstName, nationality, gender, crime, wantedIn);
		
	}
	

	
}
