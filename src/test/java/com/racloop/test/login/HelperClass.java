package com.racloop.test.login;

class HelperClass {
	public void pause(int time) {
		try {
			Thread.sleep(time);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
