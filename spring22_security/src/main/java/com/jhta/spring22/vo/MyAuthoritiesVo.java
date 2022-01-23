package com.jhta.spring22.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyAuthoritiesVo {
	private String userid;
	private String authority;
}
