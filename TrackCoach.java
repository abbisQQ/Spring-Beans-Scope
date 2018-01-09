package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	
	//Define a private field for the dependency
		private FortuneService fortuneService;
		
		
		public TrackCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}
		
	

	@Override
	public String getDailyWorkOut() {
		
		return "Run 5 miles";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
