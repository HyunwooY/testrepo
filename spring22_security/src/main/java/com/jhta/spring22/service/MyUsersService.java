package com.jhta.spring22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jhta.spring22.security.CustomUserDetail;
import com.jhta.spring22.vo.MyAuthoritiesVo;
import com.jhta.spring22.vo.MyUsersVo;

import data.mybatis.mapper.MyUsersMapper;

@Service
public class MyUsersService {
	@Autowired private MyUsersMapper mapper;
	@Autowired private PasswordEncoder passwordEncoder;
	
	public CustomUserDetail getAuths(String userid) {
		return mapper.getAuths(userid);
	}
	public int addUser(MyUsersVo vo) {
		String pwd=vo.getPassword();
		vo.setPassword(passwordEncoder.encode(pwd));
		mapper.addUser(vo);
		MyAuthoritiesVo auth=new MyAuthoritiesVo();
		auth.setUserid(vo.getUserid());
		if(vo.getUserid().equals("admin")) {
			auth.setAuthority("ROLE_ADMIN");
			mapper.addAuth(auth);
			auth.setAuthority("ROLE_MEMBER");
			mapper.addAuth(auth);
		}else {
			auth.setAuthority("ROLE_MEMBER");
			mapper.addAuth(auth);
		}
		return 1;
	}
	public int addAuth(MyAuthoritiesVo vo) {
		return mapper.addAuth(vo);
	}
}
