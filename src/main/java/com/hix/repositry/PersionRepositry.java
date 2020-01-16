package com.hix.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hix.entity.persionEntity;

@Repository
public interface PersionRepositry extends JpaRepository<persionEntity, String> {
	@Query(value = "select stateCode from persionEntity where ssaNumber=:ssno")
	public String getSsaStateCode(Integer ssno);

}
