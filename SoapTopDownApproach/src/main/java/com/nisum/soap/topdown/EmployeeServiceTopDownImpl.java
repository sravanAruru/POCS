package com.nisum.soap.topdown;

import javax.jws.WebService;

import com.baeldung.jaxws.server.topdown.EmployeeServiceTopDown;

@WebService
public class EmployeeServiceTopDownImpl implements EmployeeServiceTopDown{

	public int countEmployees() {
		return 1;
	}
	

}
