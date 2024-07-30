package com.udemy.oop.level2;

public class FanRunner {
	public static void main(String[] args) {

		Fan fan = new Fan("Oriental", "Green", 0.32);

		fan.switchOn();
		fan.setSpeed((byte) 5);
		System.out.println(fan);

		fan.switchOff();
		System.out.println(fan);

	}

}
