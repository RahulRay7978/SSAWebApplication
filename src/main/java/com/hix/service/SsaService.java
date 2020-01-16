package com.hix.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hix.model.Persion;

@Service
public interface SsaService {
	public List<String>  getAllState();
	public Persion handelSubmit(Persion per)throws Exception;
	public String  getStateCode(Integer ssnum);

}
