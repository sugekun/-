package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	@Autowired
	private AuthMapper authmapper;

	public boolean countData(String mailadress,String password) {

		AuthForm count = authmapper.select(mailadress,password);
		if (count.equals("1")) {
			return true;
		}else {
			return false;
		}

	}



}
