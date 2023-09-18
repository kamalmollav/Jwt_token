package com.numetry.JwtTokens.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class JwtResponse {

	protected JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String jwtToken;
	private String username;
		
	protected JwtResponse(String jwtToken, String username) {
		super();
		this.jwtToken = jwtToken;
		this.username = username;
	}

	public static Object builder() {
		return null;
	}
	
	
	}
	

