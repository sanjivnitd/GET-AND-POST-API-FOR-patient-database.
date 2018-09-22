package postandget.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostAndGetApiController {
	@Autowired
	Patientdataservice patientdataservice;
	@RequestMapping("/patient")
	public List<Patientdata> patient_master()
	{
		 return patientdataservice.getpatientdata();
	}
	
	@RequestMapping("/patient/{Patient_id}")
	public Patientdata patient(@PathVariable String Patient_id)
	{
		return patientdataservice.getpatientname(Patient_id);
	}
    
	@RequestMapping(method=RequestMethod.POST ,value="/patient")
	 public void postpatientdata(Patientdata p)
	{
		 patientdataservice.postpatientdata(p);
	}
}	
	

