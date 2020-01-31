package com.howtodoinjava.example.sampleservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.example.sampleservice.model.EmployeeAddress;
import com.howtodoinjava.example.sampleservice.model.EmployeeAddresses;
import com.howtodoinjava.example.sampleservice.model.EmployeeName;
import com.howtodoinjava.example.sampleservice.model.EmployeeNames;
import com.howtodoinjava.example.sampleservice.model.EmployeePhone;

@RestController
public class EmployeeDataController 
{
	private static Logger log = LoggerFactory.getLogger(EmployeeDataController.class);

	@RequestMapping(value = "/addresses", method = RequestMethod.GET)
	public EmployeeAddresses getAddresses() 
	{
		log.info("get addresses Start");

		EmployeeAddresses employeeAddressesList = new EmployeeAddresses();

		EmployeeAddress employeeAddress1 = new EmployeeAddress();
		EmployeeAddress employeeAddress2 = new EmployeeAddress();
		
		List<EmployeeAddress> addressList = new ArrayList<EmployeeAddress>();
		
		{
			employeeAddress1.setHouseNo("534");
			employeeAddress1.setStreetNo("Rockingham");
			employeeAddress1.setZipCode("75063");
			
			employeeAddress2.setHouseNo("6701");
			employeeAddress2.setStreetNo("14th Street");
			employeeAddress2.setZipCode("20012");
			
			addressList.add(employeeAddress1);
			addressList.add(employeeAddress2);
			
			employeeAddressesList.setEmployeeAddressList(addressList);
		}

		return employeeAddressesList;
	}

	@RequestMapping(value = "/phones", method = RequestMethod.GET)
	public EmployeePhone getPhoneNumbers() 
	{
		log.info("get phones Start");

		EmployeePhone employeePhone = new EmployeePhone();
		{
			ArrayList<String> phoneNumberList = new ArrayList<String>();
			
			phoneNumberList.add("2409897766");
			phoneNumberList.add("1215467809");
			
			employeePhone.setPhoneNumbers(phoneNumberList);
		}

		return employeePhone;
	}

	@RequestMapping(value = "/names", method = RequestMethod.GET)
	public EmployeeNames getEmployeeName() 
	{
		log.info("get names Start");

		EmployeeNames employeeNamesList = new EmployeeNames();

		EmployeeName employeeName1 = new EmployeeName();
		EmployeeName employeeName2 = new EmployeeName();
		
		List<EmployeeName> employeeList = new ArrayList<EmployeeName>();
		{
			employeeName1.setFirstName("Mena");
			employeeName1.setLastName("Henok");
		}
		{
			employeeName2.setFirstName("Eliana");
			employeeName2.setLastName("Henok");
		}

		employeeList.add(employeeName1);
		employeeList.add(employeeName2);

		employeeNamesList.setEmployeeNameList(employeeList);

		return employeeNamesList;
	}
}
