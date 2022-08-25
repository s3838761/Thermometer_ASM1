package main.java.gui;

import main.java.controller.TheThermometer;

public class Main {

	public static void main(String[] args) {
	    TheThermometer th = new TheThermometer();

       th.adult(95);
       th.babies(103.2);
       th.children(98.65);
	}

}
