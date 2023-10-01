package com.idwall.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idwall.domain.Wanted;
import com.idwall.resource.util.URL;
import com.idwall.service.WantedService;

@RestController
@RequestMapping(value="/wanted")
public class WantedResource {
	
	@Autowired
	private WantedService service;
	
	@GetMapping("/search")
	public ResponseEntity<List<Wanted>> findByFamilyName(
  		@RequestParam(value="familyname", defaultValue="") String familyName, 
		@RequestParam(value="firstname", defaultValue="") String firstName, 
		@RequestParam(value="nationality", defaultValue="") String nationality, 
		@RequestParam(value="gender", defaultValue="") String gender,
		@RequestParam(value="minage", defaultValue="0") int minAge,
		@RequestParam(value="maxage", defaultValue="100") int maxAge,
		@RequestParam(value="crime", defaultValue="") String crime,
		@RequestParam(value="wantedin", defaultValue="") String wantedIn, 
		@RequestParam(value="keyword", defaultValue="") String description){
		
		familyName = URL.decodeParam(familyName);
		firstName = URL.decodeParam(firstName);
		nationality = URL.decodeParam(nationality);
		gender = URL.decodeParam(gender);
		minAge = (int) minAge;
		maxAge = (int) maxAge;
		crime = URL.decodeParam(crime);
		wantedIn = URL.decodeParam(wantedIn);
		description = URL.decodeParam(description);
		
		return ResponseEntity.ok().body(service.fullSearch(familyName, firstName, nationality, gender, minAge, maxAge, crime, wantedIn, description));
		
	}
}
