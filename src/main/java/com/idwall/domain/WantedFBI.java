package com.idwall.domain;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "wantedfbi")
public class WantedFBI {
	
	@Id
	private String name;
	@Column(name = "nationalities")
	private String nationalities;
	@Column(name = "gender")
	private String gender;
	@Column(name = "dateOfBirth")
	private String dateOfBirth;
	@Column(name = "crimes")
	private String crimes;
	@Column(name = "database")
	private String database = "fbi";
	
	public WantedFBI() {
		
	}
	
	public WantedFBI(String name, String nationalities, String gender, String dateOfBirth, String wantedIn,
			String crimes, String database) {
		super();
		this.name = name;
		this.nationalities = nationalities;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.crimes = crimes;
		this.setDatabase(database);
	}

	public String getFamilyName() {
		return name;
	}

	public void setFamilyName(String name) {
		this.name = name;
	}


	public String getNationality() {
		return nationalities;
	}

	public void setNationality(String nationalities) {
		this.nationalities = nationalities;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCrime() {
		return crimes;
	}

	public void setCrime(String crimes) {
		this.crimes = crimes;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

}
