package com.hix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "STATE_TAB")
public class StateEntity {
	@Column(name = "STATE_ID")
	@Id
	private Integer stateId;

	@Column(name = "STATECODE")
	private String stateCode;

	@Column(name = "STATENAME")
	private String stateName;

}
