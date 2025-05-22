package com.campusdual.classroom;

public class Plane implements IMachine {

	private final String name;

	private boolean isFlying = false;

	private boolean isEngineOn = false;

	private boolean isMaintenance = false;

	public Plane(String name) {
		this.name = name;
	}

	public void takeOff() {
		if (isFlying) {
			System.out.println("El avión ya está volando");
		}else if (!isEngineOn) {
			System.out.println("El avión no está en marcha");
		}
		else {
			System.out.println("El avión despega");
			isFlying = true;
		}

	}

	public void land() {
		if (!isFlying) System.out.println("El avión ya está en tierra");
		else System.out.println("El avión aterriza");
		isFlying = false;
	}

	public void fly() {
		if (!isFlying) System.out.println("El avión aun no ha despegado");
		else System.out.println("El avión está volando");
	}

	@Override
	public void start() {
		if (!isEngineOn && !isMaintenance){
			System.out.println("Avión en marcha");
			isEngineOn = true;
		}
		else if (isMaintenance) System.out.println("El avión está en mantenimiento no se puede poner en marcha");
		else System.out.println("El avión ya está en marcha");
	}

	@Override
	public void stop() {
		if (isEngineOn){
			System.out.println("Avión detenido");
			isEngineOn = false;
		}
		else System.out.println("El avión ya está detenido");
	}

	@Override
	public void maintenance() {
		if (!isMaintenance){
			System.out.println("Avión en mantenimiento");
			isMaintenance = true;
		}
		else {
			System.out.println("El avión ya no está en mantenimiento");
			isMaintenance = false;
		}
	}
}
