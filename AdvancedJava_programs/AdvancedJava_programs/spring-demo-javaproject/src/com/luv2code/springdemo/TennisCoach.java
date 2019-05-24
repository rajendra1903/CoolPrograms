package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("sillyFellow")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practise with tennis ball daily";
	}

}
