package com.kirash.alex.strategy.around_world.main;
import com.kirash.alex.strategy.around_world.strategies.Plane;
import com.kirash.alex.strategy.around_world.strategies.Ship;
import com.kirash.alex.strategy.around_world.strategies.Bike;
import com.kirash.alex.strategy.around_world.context.Context;

public class MainApp {

	public static void main(String[] args) {
	System.out.println("Travel around the world!!!\n");	
		
	Context context = new Context();
	
	String [] pl = {"2000$", "20 hour", "Yes"} ;
	System.out.println("If your choose is plane: ");
	context.setStrategy(new Plane());	
	context.executeStrategy(pl);

	String [] ship = {"1000$", "80 hour", "Yes"} ;
	System.out.println("If your choose is ship: ");
	context.setStrategy(new Ship());
	context.executeStrategy(ship);
	
	String [] bike = {"200$", "300 hour", "Yes"} ;
	System.out.println("If your choose is bike: ");
	context.setStrategy(new Bike());
	context.executeStrategy(bike);
	}}