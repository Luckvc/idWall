package com.idwall.domain;

public class WantedInterpol {
	
	private String firstName;
	private String lastName;
	private String nationalities;
	private String gender;
	private String dateOfBirth;
	private String crimes;
	private String wantedIn;
	private String database = "Interpol";
	
	public WantedInterpol() {
		
	}
	
	public WantedInterpol(String firstName, String lastName, String nationalities, String gender, String dateOfBirth,
			String crimes, String wantedIn, String database) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalities = nationalities;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.crimes = crimes;
		this.wantedIn = wantedIn;
		this.setDatabase(database);
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getWantedIn() {
		return wantedIn;
	}

	public void setWantedIn(String wantedIn) {
		this.wantedIn = wantedIn;
	}

}
