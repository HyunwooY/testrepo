package com.jhta.spring22.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyUsersVo {
	private String userid;
	private String username;
	private String password;
	private Date regdate;
	private String enabled;
}
