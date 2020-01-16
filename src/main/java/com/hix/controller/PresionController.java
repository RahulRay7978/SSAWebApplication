package com.hix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hix.model.Persion;
import com.hix.service.SsaService;

@Controller
public class PresionController {

	@Autowired
	private SsaService service;

	@RequestMapping("/")
	public String displayPersionfrom(Model model) throws Exception {
		Persion pd = new Persion();
		model.addAttribute("details", pd);
		List<String> allState = service.getAllState();
		model.addAttribute("allstates", allState);
		return "persion";
	}

	@RequestMapping(value = "/personSave",method = RequestMethod.POST)
	public String savePersionData(@ModelAttribute("details") Persion per, Model model) throws Exception {
		Persion submit = service.handelSubmit(per);
		Integer ssaNumber = submit.getSsaNumber();
		String cinvertSSNNo= String.valueOf(ssaNumber);
		StringBuffer sb=new StringBuffer(cinvertSSNNo);
		sb.insert(3,"-");
		sb.insert(6,"-");
		if(ssaNumber!=null)
		model.addAttribute("result","the Registation Succesful::"+sb);
		else
			model.addAttribute("errorresult","the Registation failed try again");	
		return "persion";
	}

}
