package com.spring.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IplTeamVo {

	private Integer tid;
	private String tname;
	private String owner;
	private String area;
}
