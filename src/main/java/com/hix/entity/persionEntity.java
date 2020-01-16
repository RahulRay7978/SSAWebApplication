package com.hix.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSION_DETAILS")
public class persionEntity {
	@Id
	@SequenceGenerator(name = "SSA_SEQ", sequenceName ="SSA_NUM_SEQ", initialValue = 100000000, allocationSize = 1)
	@GeneratedValue(generator = "SSA_SEQ")
	@Column(name = "SSA_NUMBER",length = 30)
	private Integer ssaNumber;
	@Column(name = "FNAME",length = 20)
	private String fname;
	@Column(name = "LNAME",length = 20)
	private String lname;
	@Column(name = "Email",length = 30)
	private String email;
	@Column(name = "GENDER",length = 10)
	private String gender;

	@Column(name = "DOB")
	private Date dob;
	@Column(name = "STATE_CODE",length = 10)
	private String stateCode;

}
