package com.jhta.spring22.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jhta.spring22.service.MyUsersService;

public class CustomUserDetailService implements UserDetailsService{
	@Autowired private MyUsersService service;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		CustomUserDetail userDetail=service.getAuths(username);
		return userDetail;
	}

}
