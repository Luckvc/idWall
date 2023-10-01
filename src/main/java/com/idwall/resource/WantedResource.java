package com.idwall.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idwall.domain.WantedFBI;
import com.idwall.resource.util.URL;
import com.idwall.service.WantedService;

@RestController
@RequestMapping(value="/wanted")
public class WantedResource {
	
	@Autowired
	private WantedService service;
	
	@GetMapping("/search")
	public ResponseEntity<List<WantedFBI>> findByFamilyName(
  		@RequestParam(value="familyname", defaultValue="") String familyName, 
		@RequestParam(value="firstname", defaultValue="") String firstName, 
		@RequestParam(value="nationality", defaultValue="") String nationality, 
		@RequestParam(value="gender", defaultValue="") String gender,
		@RequestParam(value="crime", defaultValue="") String crime,
		@RequestParam(value="wantedin", defaultValue="") String wantedIn){
		
		familyName = URL.decodeParam(familyName);
		firstName = URL.decodeParam(firstName);
		nationality = URL.decodeParam(nationality);
		gender = URL.decodeParam(gender);
		crime = URL.decodeParam(crime);
		wantedIn = URL.decodeParam(wantedIn);
		
		return ResponseEntity.ok().body(service.fullSearch(familyName, firstName, nationality, gender, crime, wantedIn));
		
	}
}
