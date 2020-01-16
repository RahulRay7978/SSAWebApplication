package com.hix.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hix.entity.persionEntity;
import com.hix.model.Persion;
import com.hix.repositry.PersionRepositry;
import com.hix.repositry.StateRepositry;

@Service
public class SsaServiceImpl implements SsaService{
	@Autowired
	private PersionRepositry pRepo;
	@Autowired
	private StateRepositry sRepo;
	@Override
	public List<String> getAllState() {
		List<String> allStateName = sRepo.getAllStateName();
		return allStateName;
	}
	@Override
	public Persion handelSubmit(Persion per) throws Exception {
		persionEntity entity=new persionEntity();
		BeanUtils.copyProperties(per, entity);
		String ssaCode = sRepo.getSsaCode(per.getState());
		entity.setStateCode(ssaCode);
		persionEntity 	save = pRepo.save(entity);
		Persion pd=new Persion();
		BeanUtils.copyProperties(save, pd);
		return pd;
	}

	@Override
	public String getStateCode(Integer ssnum) {
		String ssaStateCode = pRepo.getSsaStateCode(ssnum);
		return ssaStateCode;
	}
	
}
