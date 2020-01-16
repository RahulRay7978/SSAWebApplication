package com.hix.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hix.entity.StateEntity;

public interface StateRepositry extends JpaRepository<StateEntity, Integer> {
	@Query(value = "select stateName from StateEntity")
	public List<String> getAllStateName();
	
	@Query(value = "select stateCode from StateEntity where  stateName=:ssaName")
	public String getSsaCode(String ssaName);
}
