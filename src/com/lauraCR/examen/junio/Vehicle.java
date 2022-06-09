package com.lauraCR.examen.junio;

interface Vehicle {

	void changeGear(int newGear);

	void speedUp(int increment);

	void applyBrakes(int decrement);

	void printStates();

	int getSpeed();

}