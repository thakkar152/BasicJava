package com.udemy.gamingconsole;

public class Mario implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");

	}

	@Override
	public void down() {
		System.out.println("Go to hole");

	}

	@Override
	public void left() {

	}

	@Override
	public void right() {
		System.out.println("Move Forward");
	}

}
