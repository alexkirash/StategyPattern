package com.kirash.alex.strategy.around_world.strategies;
import com.kirash.alex.strategy.around_world.interfaces.Strategy;

public class Plane implements Strategy{

	public void going(String [] st) {
	
		String money = st[0];
		String time = st[1];
		String fun = st[2];
	
		System.out.println("You spend a money: " + money);
		System.out.println("You spend a time: " + time);
		System.out.println("You have a fun: " + fun);
	}
}

