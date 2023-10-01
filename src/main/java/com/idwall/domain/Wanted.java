package com.idwall.domain;

public class Wanted {
	
	private String familyName;
	private String firstName;
	private String nationality;
	private String gender;
	private int age;
	private String wantedIn;
	private String crime;
	private String description;
	private String database;
	
	public Wanted() {
		
	}
	
	public Wanted(String familyName, String firstName, String nationality, String gender, int age, String wantedIn,
			String crime, String description, String database) {
		super();
		this.familyName = familyName;
		this.firstName = firstName;
		this.nationality = nationality;
		this.gender = gender;
		this.age = age;
		this.wantedIn = wantedIn;
		this.crime = crime;
		this.description = description;
		this.setDatabase(database);
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWantedIn() {
		return wantedIn;
	}

	public void setWantedIn(String wantedIn) {
		this.wantedIn = wantedIn;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

}
