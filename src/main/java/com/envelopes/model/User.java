package com.envelopes.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Data
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User extends BaseModel{

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String email;
	
	private String password;

	protected User() {
	}


}
