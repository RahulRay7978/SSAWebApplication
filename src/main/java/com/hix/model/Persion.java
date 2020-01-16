package com.hix.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Persion {
	private Integer ssaNumber;
	private String fname;
	private String lname;
	private String email;
	private String gender;

	private Date dob;
	private String state;

}
