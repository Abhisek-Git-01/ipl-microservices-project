package com.spring.vo;


import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Table(name="IPL_PLAYERS")
@NoArgsConstructor
@AllArgsConstructor
public class IplPlayersVo {

		
		private String pname;
		private String role;
		private Integer age;
}
