package com.kirash.alex.strategy.around_world.context;
import com.kirash.alex.strategy.around_world.interfaces.Strategy;

public class Context {
	Strategy strategy;
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	};

	public void executeStrategy (String[] st) {
		strategy.going(st);
	}

}