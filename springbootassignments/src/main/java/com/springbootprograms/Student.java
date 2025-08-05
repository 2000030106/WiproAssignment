package com.springbootprograms;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
	 @Size(min = 3, max = 30, message = "{firstName.size}")
	    private String firstName;

	    @Size(min = 3, max = 30, message = "{lastName.size}")
	    private String lastName;

	    @NotNull(message = "{gender.notNull}")
	    private String gender;

	    @NotBlank(message = "{dob.notBlank}")
	    private String dob;

	    @NotBlank(message = "{email.notBlank}")
	    private String email;

	    @NotNull(message = "{section.notNull}")
	    private String section;

	    @NotBlank(message = "{country.notBlank}")
	    private String country;

	    private boolean firstAttempt;

	    @NotEmpty(message = "{subjects.notEmpty}")
	    private List<String> subjects;

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

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSection() {
			return section;
		}

		public void setSection(String section) {
			this.section = section;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public boolean isFirstAttempt() {
			return firstAttempt;
		}

		public void setFirstAttempt(boolean firstAttempt) {
			this.firstAttempt = firstAttempt;
		}

		public List<String> getSubjects() {
			return subjects;
		}

		public void setSubjects(List<String> subjects) {
			this.subjects = subjects;
		}


}
